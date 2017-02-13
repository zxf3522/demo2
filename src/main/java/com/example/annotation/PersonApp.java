package com.example.annotation;

import org.springframework.stereotype.Controller;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by zhaoy on 2017/2/7.
 */

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Controller
public @interface PersonApp {
    String name() default "";
}
