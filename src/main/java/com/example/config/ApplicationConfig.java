package com.example.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import com.example.service.Person;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.sql.SQLException;

/**
 * Created by Administrator on 2017/2/9 0009.
 */
@Configuration
public class ApplicationConfig {

    @Value("${datasource.url}")
    private  String url;

    @Value("${datasource.driver-class-name}")
    private  String driverClassName;

    @Value("${datasource.username}")
    private  String username;

    @Value("${datasource.password}")
    private  String password;



    @Bean(name = "person")
    public Person person(){
        Person person=new Person("小明",18);
        person.say();
    return person;
}

     @Primary
     @Bean(name="datasource")
        public DruidDataSource druidDataSource(){
         DruidDataSource druidDataSource=new DruidDataSource();
         druidDataSource.setDriverClassName(driverClassName);
         druidDataSource.setUrl(url);
         druidDataSource.setUsername(username);
         druidDataSource.setPassword(password);
         druidDataSource.setName("dataSource");
         druidDataSource.setEnable(true);
         druidDataSource.setMaxActive(3);
         try{
             druidDataSource.setFilters("stat,wall");
         }catch(SQLException e){
             e.printStackTrace();
         }
         return druidDataSource;
     }

    @Bean
    public ServletRegistrationBean druidServlet() {
        return new ServletRegistrationBean(new StatViewServlet(), "/druid/*");
    }




}
