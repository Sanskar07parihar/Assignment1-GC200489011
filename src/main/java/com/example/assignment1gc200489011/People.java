package com.example.assignment1gc200489011;


public class People {

    private String code,name, continent, region;
    private int population;




    public People(String code, String name,String continent, String region, int population) {
        setCode(code);
        setName(name);
        setContinent(continent);
        setRegion(region);
        setPopulation(population);


    }
    /**
     * Creating Getters and setters methods for all instance variables
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }



    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }


}