package com.codeclan.example.opensaucebackend.components;

import com.codeclan.example.opensaucebackend.models.Ingredient;
import com.codeclan.example.opensaucebackend.models.Cocktail;
import com.codeclan.example.opensaucebackend.repository.cocktails.CocktailRepository;
import com.codeclan.example.opensaucebackend.repository.ingredients.IngredientRepository;
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

    public DataLoader(){

    }

    @Override
    public void run(ApplicationArguments args) throws Exception {


        Ingredient lightRum = new Ingredient("Light Rum", true);
        Ingredient darkRum = new Ingredient("Dark Rum", true);
        Ingredient vodka = new Ingredient("Vodka", true);

        ingredientRepository.save(lightRum);
        ingredientRepository.save(darkRum);
        ingredientRepository.save(vodka);

        Cocktail pinaColada = new Cocktail(
                "Pina Colada",
                "Mix with crushed ice in a blender. Serve in a hurricane glass.",
                "a pineapple leaf and wedge of lime",
                "https://www.youtube.com/embed/TazHNpt6OTo?controls=1?autoplay=1");

        pinaColada.addIngredient(lightRum);
        cocktailRepository.save(pinaColada);

        Cocktail darkAndStormy = new Cocktail(
                "Dark And Stormy",
                "Build in a collins glass.",
                "a wedge of lime",
                "https://youtu.be/lS-af9Q-zvQ");

        darkAndStormy.addIngredient(darkRum);
        cocktailRepository.save(darkAndStormy);

        Cocktail daiquiri = new Cocktail(
                "Daiquiri",
                "Shake hard with ice. Serve in a coupe glass.",
                "a lime wheel",
                "https://youtu.be/JNYOVEXJBBM");

        daiquiri.addIngredient(lightRum);
        cocktailRepository.save(daiquiri);

        Cocktail zombie = new Cocktail(
                "Zombie",
                "Shake hard with ice. Serve in a tiki mug filled with crushed ice.",
                "lots of fruit & a tiny umbrella",
                "https://youtu.be/Qj5x6pbJMyU");

        zombie.addIngredient(lightRum);
        zombie.addIngredient(darkRum);
        cocktailRepository.save(zombie);

    }

}
