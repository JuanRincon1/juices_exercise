package co.edu.umanizales.juices_exercise.models;

import java.util.List;

public class Juice {
    private String code;
    private String name;
    private List<String> fruits;

    public Juice(String code, String name, List<String> fruits) {
        this.code = code;
        this.name = name;
        this.fruits = fruits;
    }

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

    public List<String> getFruits() {
        return fruits;
    }

    public void setFruits(List<String> fruits) {
        this.fruits = fruits;
    }
}
