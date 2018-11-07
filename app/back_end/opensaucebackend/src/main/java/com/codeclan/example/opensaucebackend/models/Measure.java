package com.codeclan.example.opensaucebackend.models;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "measures")
public class Measure {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "amount")
    private double amount;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "ingredient_id", nullable = false)
    private Ingredient ingredient;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "cocktail_id", nullable = false)
    private Cocktail cocktail;

    public Measure(double amount, Ingredient ingredient, Cocktail cocktail){
        this.amount = amount;
        this.ingredient = ingredient;
        this.cocktail = cocktail;
    }

    public Measure (){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Ingredient getIngredient() {
        return ingredient;
    }

    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
    }

    public Cocktail getCocktail() {
        return cocktail;
    }

    public void setCocktail(Cocktail cocktail) {
        this.cocktail = cocktail;
    }
}
