package com.helenspractice.review.Entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "cats")
public class BigCats {

    private String name;
    private int age;
    private String species;
    private String genus;
    private Habitat habitat;

    public BigCats(String name, int age, String species, String genus, Habitat habitat) {
        this.name = name;
        this.age = age;
        this.species = species;
        this.genus = genus;
        this.habitat = habitat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getGenus() {
        return genus;
    }

    public void setGenus(String genus) {
        this.genus = genus;
    }

    public Habitat getHabitat() {
        return habitat;
    }

    public void setHabitat(Habitat habitat) {
        this.habitat = habitat;
    }
}
