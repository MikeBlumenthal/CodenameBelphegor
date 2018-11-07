package com.codeclan.example.opensaucebackend;

import com.codeclan.example.opensaucebackend.models.Cocktail;
import com.codeclan.example.opensaucebackend.repository.ingredients.IngredientRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OpensaucebackendApplicationTests {

    @Autowired
    IngredientRepository ingredientRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void canGetAllCocktailsForIngredientID() {
        List<Cocktail> found = ingredientRepository.allCocktailsContainingIngredientWithId(1L);
        assertEquals(1, found.size());
        assertEquals("Pina Colada", found.get(0).getName());
    }

}
