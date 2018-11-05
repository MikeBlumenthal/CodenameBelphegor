package com.codeclan.example.opensaucebackend.repository.cocktails;
import com.codeclan.example.opensaucebackend.models.Cocktail;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CocktailRepository extends JpaRepository<Cocktail, Long>, CocktailRepositoryCustom {
}
