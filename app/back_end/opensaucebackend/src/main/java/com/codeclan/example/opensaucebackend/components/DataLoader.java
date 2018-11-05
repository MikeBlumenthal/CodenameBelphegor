package com.codeclan.example.opensaucebackend.components;

import com.codeclan.example.opensaucebackend.models.Cocktail;
import com.codeclan.example.opensaucebackend.models.Ingredient;
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
                "Mix with crushed ice in a blender. Serve in a hurricane glass.",
                "A pineapple leaf and wedge of lime",
                "https://youtu.be/TazHNpt6OTo");
        cocktailRepository.save(pinaColada);

        Ingredient lightRum = new Ingredient("Light Rum", true);
        Ingredient coconutCream = new Ingredient("Coconut Cream", false);
        Ingredient pineappleJuice = new Ingredient("Pineapple Juice", false);
        ingredientRepository.save(lightRum);
        ingredientRepository.save(coconutCream);
        ingredientRepository.save(pineappleJuice);

        Measure measure1 = new Measure(50, lightRum, pinaColada);
        Measure measure2 = new Measure(50, coconutCream, pinaColada);
        Measure measure3 = new Measure(150, pineappleJuice, pinaColada);
        measureRepository.save(measure1);
        measureRepository.save(measure2);
        measureRepository.save(measure3);
    }

}
