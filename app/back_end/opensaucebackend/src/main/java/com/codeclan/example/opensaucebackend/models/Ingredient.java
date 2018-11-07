package com.codeclan.example.opensaucebackend.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="ingredients")
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "alcoholic")
    private Boolean alcoholic;

    @JsonIgnoreProperties("ingredients")
    @ManyToMany
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @JoinTable(
            name = "ingredients_cocktails",
            joinColumns = {@JoinColumn(name = "ingredient_id", nullable = false, updatable = false)},
            inverseJoinColumns = {@JoinColumn(name="cocktail_id", nullable = false, updatable = false)}
    )
    private List<Cocktail> cocktails;

    public Ingredient(String name, boolean alcoholic) {
        this.name = name;
        this.alcoholic = alcoholic;
        this.cocktails = new ArrayList<Cocktail>();
    }

    public Ingredient() {

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

    public Boolean getAlcoholic() {
        return alcoholic;
    }

    public void setAlcoholic(Boolean alcoholic) {
        this.alcoholic = alcoholic;
    }

    public List<Cocktail> getCocktails() {
        return cocktails;
    }

    public void setCocktails(List<Cocktail> cocktails) {
        this.cocktails = cocktails;
    }

    public void addCocktail(Cocktail cocktail){
        this.cocktails.add(cocktail);
    }

}
