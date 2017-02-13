package com.example.service;

/**
 * Created by Administrator on 2017/2/9 0009.
 */
public class Person {
    private String name;
    private int age;

    public Person(){}

    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }

    public void  say() {
        System.out.println("my name is"+this.name);
        System.out.println("my age is"+this.age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
