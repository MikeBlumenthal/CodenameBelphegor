package com.codeclan.example.opensaucebackend.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name="cocktails")
public class Cocktail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private String recipe;

    @Column
    private String song;

    @JsonIgnore
    @OneToMany(mappedBy = "cocktail", fetch = FetchType.LAZY)
    private ArrayList<Measure> contents;

    public Cocktail(String name, String recipe, String song){
        this.name = name;
        this.recipe = recipe;
        this.song = song;
        this.contents = new ArrayList<>();
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

    public String getRecipe() {
        return recipe;
    }

    public void setRecipe(String recipe) {
        this.recipe = recipe;
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public ArrayList<Measure> getContents() {
        return contents;
    }

    public void setContents(ArrayList<Measure> contents) {
        this.contents = contents;
    }
}
