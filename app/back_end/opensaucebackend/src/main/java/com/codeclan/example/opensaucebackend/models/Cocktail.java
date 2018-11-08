package com.codeclan.example.opensaucebackend.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.ArrayList;
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
    private String contents;

    @Column(name = "recipe")
    private String recipe;

    @Column(name = "garnish")
    private String garnish;

    @Column(name = "song")
    private String song;

    @JsonIgnoreProperties("cocktails")
    @ManyToMany
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @JoinTable(
            joinColumns = {@JoinColumn(name = "cocktail_id", nullable = false, updatable = false)},
            inverseJoinColumns = {@JoinColumn(name = "ingredient_id", nullable = false, updatable = false)}
    )
    private List<Ingredient> ingredients;

    public Cocktail(String name, String contents, String recipe, String garnish, String song){
        this.name = name;
        this.contents = contents;
        this.recipe = recipe;
        this.garnish = garnish;
        this.song = song;
        this.ingredients =new ArrayList<Ingredient>();
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

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
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

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public void addIngredient(Ingredient ingredient){
        this.ingredients.add(ingredient);
    }

}
