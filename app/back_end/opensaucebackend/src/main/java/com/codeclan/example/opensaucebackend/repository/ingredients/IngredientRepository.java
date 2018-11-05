package com.codeclan.example.opensaucebackend.repository.ingredients;

import com.codeclan.example.opensaucebackend.models.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredientRepository extends JpaRepository<Ingredient, Long>, IngredientRepositoryCustom {

}
