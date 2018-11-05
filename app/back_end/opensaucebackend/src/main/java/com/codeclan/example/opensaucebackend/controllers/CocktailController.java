package com.codeclan.example.opensaucebackend.controllers;

import com.codeclan.example.opensaucebackend.repository.cocktails.CocktailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/cocktails")
public class CocktailController {

    @Autowired
    CocktailRepository cocktailRepository;

}
