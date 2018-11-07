package com.codeclan.example.opensaucebackend.components;

import com.codeclan.example.opensaucebackend.models.Ingredient;
import com.codeclan.example.opensaucebackend.models.Cocktail;
import com.codeclan.example.opensaucebackend.models.Measure;
import com.codeclan.example.opensaucebackend.repository.cocktails.CocktailRepository;
import com.codeclan.example.opensaucebackend.repository.ingredients.IngredientRepository;
import com.codeclan.example.opensaucebackend.repository.measures.MeasureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component

public class DataLoader implements ApplicationRunner {

    @Autowired
    CocktailRepository cocktailRepository;

    @Autowired
    IngredientRepository ingredientRepository;

    @Autowired
    MeasureRepository measureRepository;

    public DataLoader(){

    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Cocktail pinaColada = new Cocktail(
                "Pina Colada",
                "1 part Light Rum, 1 part coconut cream, 3 parts Pineapple Juice",
                "Mix with crushed ice in a blender. Serve in a hurricane glass.",
                "a pineapple leaf and wedge of lime",
                "https://youtu.be/TazHNpt6OTo");
        cocktailRepository.save(pinaColada);

        Ingredient lightRum = new Ingredient("Light Rum", true);
        Ingredient darkRum = new Ingredient("Dark Rum", true);
        Ingredient vodka = new Ingredient("Vodka", true);
        Ingredient gin = new Ingredient("Gin", true);
        ingredientRepository.save(lightRum);
        ingredientRepository.save(darkRum);
        ingredientRepository.save(vodka);
        ingredientRepository.save(gin);

        Measure measure1 = new Measure(50, lightRum, pinaColada);
        measureRepository.save(measure1);
    }

}
