package com.example.demo.service.serviceImpl;

public class Cat implements Animal{
    String name;

    @Override
    public String kuchBhi() {
        return "Meow";
    }
}
