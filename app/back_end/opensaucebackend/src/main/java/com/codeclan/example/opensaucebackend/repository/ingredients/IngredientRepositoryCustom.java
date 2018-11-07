package com.codeclan.example.opensaucebackend.repository.ingredients;

import com.codeclan.example.opensaucebackend.models.Cocktail;

import java.util.List;

public interface IngredientRepositoryCustom {
    List<Cocktail> getAllCocktailsForIngredientByID(Long id);
}
