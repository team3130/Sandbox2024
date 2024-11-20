package ExampleClasses;

import java.sql.SQLOutput;

public class Cat {
    // INSTANCE VARIABLES
    public String species;
    public String color;
    public int population;

    // CONSTRUCTOR
    public Cat(String scientificName, String color, int population) {
        this.species = scientificName;
        this.color = color;
        this.population = population;
    }

    // POSSIBLE METHODS
    public int addPopulation(int num) {
        return this.population + num; // note this doesn't actually modify the population, only returns the modified value
    }

    public String getSpecies() {
        System.out.println(this.species);
        return this.species;
    }

    // HOW TO CREATE OBJECTS

    public static void main(String[] args) {
        Cat lion = new Cat("Panthera leo", "Gold", 23000);
        Cat tabby = new Cat("Felis Catus", "Mixed", 3000000);
        Cat cheetah = new Cat("Acinonyx jubatus", "Black and yellow", 7000);
        System.out.println(lion.species);
        System.out.println(tabby.species);
        System.out.println(cheetah.species);
        System.out.println("Oh No Global Warning!");
        System.out.println("Cat Species Populations=");
        System.out.println(lion.population-23000);
        System.out.println(tabby.population-3000000);
        System.out.println(cheetah.population-7000);
    }
}