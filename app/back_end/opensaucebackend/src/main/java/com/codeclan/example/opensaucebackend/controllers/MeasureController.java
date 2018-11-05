package com.codeclan.example.opensaucebackend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/measures")
public class MeasureController {

    @Autowired
    MeasureController measureController;

}
