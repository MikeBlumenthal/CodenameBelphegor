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
                "60ml light rum, 90ml pineapple juice, 30ml coconut cream, 15ml lime juice",
                "Mix with crushed ice in a blender, Serve in a hurricane glass.",
                "a pineapple leaf and wedge of lime",
                "https://www.youtube.com/embed/TazHNpt6OTo?controls=1?autoplay=1");

        pinaColada.addIngredient(lightRum);
        cocktailRepository.save(pinaColada);

        Cocktail darkAndStormy = new Cocktail(
                "Dark And Stormy",
                "50ml dark rum, 20ml lime juice, 100ml ginger beer",
                "Build in a collins glass.",
                "a wedge of lime",
                "https://www.youtube.com/embed/iv8GW1GaoIc?controls=1?autoplay=1");

        darkAndStormy.addIngredient(darkRum);
        cocktailRepository.save(darkAndStormy);

        Cocktail daiquiri = new Cocktail(
                "Classic Daiquiri",
                "50ml light rum, 20ml lime juice, 10ml gomme",
                "Shake hard with ice. Serve in a coupe glass.",
                "a lime zest twist",
                "https://www.youtube.com/embed/JNYOVEXJBBM?controls=1?autoplay=0");

        daiquiri.addIngredient(lightRum);
        cocktailRepository.save(daiquiri);

        Cocktail zombie = new Cocktail(
                "Zombie",
                "50ml light rum, 50ml dark rum, 25ml cointreau, 50ml pineapple juice, 50ml orange juice, 20ml lime juice, 10ml grenadine",
                "Shake hard with ice. Serve in a tiki mug filled with crushed ice.",
                "lots of fruit & a tiny umbrella",
                "https://www.youtube.com/embed/6Ejga4kJUts?controls=1?autoplay=0");

        zombie.addIngredient(lightRum);
        zombie.addIngredient(darkRum);
        cocktailRepository.save(zombie);

    }

}
