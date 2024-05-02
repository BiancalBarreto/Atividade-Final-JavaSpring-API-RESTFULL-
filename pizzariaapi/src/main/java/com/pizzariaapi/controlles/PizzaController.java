package com.pizzariaapi.controlles;

import com.pizzariaapi.models.Pizza;
import com.pizzariaapi.repositories.PizzaRepository;
import com.pizzariaapi.sarvices.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PizzaController {

    @Autowired
    private PizzaService pizzaService;


    @RequestMapping(value = "/pizzas", method = RequestMethod.POST)
    public Pizza save(@RequestBody Pizza pizza) {
        return this.pizzaService.save(pizza);
    }

    @RequestMapping(value = "/pizzas", method = RequestMethod.GET)
    public List<Pizza> findAll() {
        return this.pizzaService.findAll();
    }

    @RequestMapping(value = "/pizzas/{id}", method = RequestMethod.GET)
    public Pizza findById(@PathVariable Long id) {
        return this.pizzaService.findById(id);
    }

    @RequestMapping(value = "/pizzas/{id}", method = RequestMethod.DELETE)
    public Pizza deleteById(@PathVariable Long id) {
        return this.pizzaService.deleteById(id);
    }

    @RequestMapping(value = "/pizzas/{id}", method = RequestMethod.PUT)
    public Pizza updateById(@PathVariable Long id, @RequestBody Pizza pizza) {
        return this.pizzaService.updateById(id, pizza);
    }



}
