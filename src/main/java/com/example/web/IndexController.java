package com.example.web;

import com.example.annotation.PersonApp;
import com.example.domain.City;
import com.example.domain.Province;
import com.example.domain.StudentServer;
import com.example.repository.CityRep;
import com.example.repository.ProvinceRep;
import com.example.repository.StudentServerRep;
import com.example.service.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by Administrator on 2017/2/9 0009.
 */


@PersonApp
public class IndexController {
    @Autowired
    private Person person;

    @Autowired
    private StudentServerRep studentServerRep;


    @Autowired
    private CityRep cityRep;

    @Autowired
    private ProvinceRep provinceRep;

//    @Autowired
//    private JdbcTemplate jdbcTemplate;

    @Value("${datasource.username}")
    private String name;


    @RequestMapping("")
    public String index(Model model)
    {
        List<City> cityList=cityRep.findAll();
        List<Province> provinceList=provinceRep.findAll();
        List<StudentServer> studentList=studentServerRep.findAll();

        model.addAttribute("studentList",studentList);
        model.addAttribute("name",name);
        model.addAttribute("person",person);

        return "index";
    }
}
