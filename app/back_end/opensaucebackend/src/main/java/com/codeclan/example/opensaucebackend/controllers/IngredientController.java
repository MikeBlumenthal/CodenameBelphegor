package com.codeclan.example.opensaucebackend.controllers;

import com.codeclan.example.opensaucebackend.repository.ingredients.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/ingredients")
public class IngredientController {

    @Autowired
    IngredientRepository ingredientRepository;

}
