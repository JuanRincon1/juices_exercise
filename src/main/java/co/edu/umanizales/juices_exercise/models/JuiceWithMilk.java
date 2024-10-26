package co.edu.umanizales.juices_exercise.models;

import java.util.List;

public class JuiceWithMilk extends Juice {
    private boolean withMilk = true;

    public JuiceWithMilk(String code, String name, List<String> fruits) {
        super(code, name, fruits);
    }

    public boolean getWithMilk() {
        return withMilk;
    }
}
