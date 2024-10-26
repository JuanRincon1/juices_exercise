package co.edu.umanizales.juices_exercise.models;

import java.util.List;

public class JuiceWithSugar extends Juice {
    private boolean withSugar = true;

    public JuiceWithSugar(String code, String name, List<String> fruits) {
        super(code, name, fruits);
    }

    public boolean getWithSugar() {
        return withSugar;
    }
}
