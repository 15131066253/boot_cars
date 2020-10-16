package com.nantian.boot_cars.service.impl;

import com.nantian.boot_cars.service.CarsService;
import org.springframework.stereotype.Service;

@Service
public class CarsServiceImpl implements CarsService {

    @Override
    public String getCars() {
        return "cars";
    }
}
