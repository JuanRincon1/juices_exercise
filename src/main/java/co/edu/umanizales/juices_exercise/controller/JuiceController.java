package co.edu.umanizales.juices_exercise.controller;

import co.edu.umanizales.juices_exercise.models.Juice;
import co.edu.umanizales.juices_exercise.service.JuiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/api/juices")
public class JuiceController {

    @Autowired
    private JuiceService juiceService;

    @GetMapping
    public List<Juice> getAllJuices() {
        return juiceService.getAllJuices();
    }

    @GetMapping("/fruit/{fruit}")
    public List<Juice> getJuicesByFruit(@PathVariable String fruit) {
        return juiceService.getJuiceByFruit(fruit);
    }
}
