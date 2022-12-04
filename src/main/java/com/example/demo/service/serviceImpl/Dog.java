package com.example.demo.service.serviceImpl;

import org.springframework.stereotype.Service;

@Service
public class Dog implements Animal{
    @Override
    public String kuchBhi() {
        return "bark";
    }
}
