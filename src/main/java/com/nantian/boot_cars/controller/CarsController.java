package com.nantian.boot_cars.controller;

import com.nantian.boot_cars.service.CarsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping
public class CarsController {
    @Autowired
    private CarsService carsService;

    @RequestMapping("/getCars")
    public String getCars(){
        String cars = carsService.getCars();
        return cars;
    }
}
