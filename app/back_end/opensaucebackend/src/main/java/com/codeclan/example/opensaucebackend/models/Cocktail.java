package com.codeclan.example.opensaucebackend.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="cocktails")
public class Cocktail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "contents")
    private String ingredients;

    @Column(name = "recipe")
    private String recipe;

    @Column(name = "garnish")
    private String garnish;

    @Column(name = "song")
    private String song;

    @OneToMany(mappedBy = "cocktail", fetch = FetchType.LAZY)
    private List<Measure> measures;

    public Cocktail(String name, String ingredients, String recipe, String garnish, String song){
        this.name = name;
        this.ingredients = ingredients;
        this.recipe = recipe;
        this.garnish = garnish;
        this.song = song;
    }

    public Cocktail (){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getRecipe() {
        return recipe;
    }

    public void setRecipe(String recipe) {
        this.recipe = recipe;
    }

    public String getGarnish() {
        return garnish;
    }

    public void setGarnish(String garnish) {
        this.garnish = garnish;
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public List<Measure> getMeasures() {
        return measures;
    }

    public void setMeasures(List<Measure> measures) {
        this.measures = measures;
    }
}
