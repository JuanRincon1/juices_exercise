package co.edu.umanizales.juices_exercise.service;

import co.edu.umanizales.juices_exercise.models.Juice;
import co.edu.umanizales.juices_exercise.models.JuiceWithMilk;
import co.edu.umanizales.juices_exercise.models.JuiceWithSugar;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class JuiceService {
    private List<Juice> juices = new ArrayList<>();

    public JuiceService() {
        juices.add(new JuiceWithMilk("001", "Tropical Mix", List.of("Pineapple", "Mango", "Banana")));
        juices.add(new JuiceWithSugar("002", "Berry Delight", List.of("Strawberry", "Blueberry", "Pineapple")));
        juices.add(new JuiceWithMilk("003", "Green Smoothie", List.of("Apple", "Pineaple", "Mango")));
        juices.add(new JuiceWithSugar("004", "Exotic Fusion", List.of("Pineapple", "Apple", "Mango"))); // Pineapple y Mango en común
    }
    

    public List<Juice> getAllJuices() {
        return this.juices;
    }

    public List<Juice> getJuiceByFruit(String fruit) {
        return juices.stream()
                .filter(juice -> juice.getFruits().contains(fruit))
                .collect(Collectors.toList());
    }
    
}
