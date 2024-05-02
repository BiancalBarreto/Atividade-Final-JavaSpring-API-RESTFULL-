package com.pizzariaapi.sarvices;

import com.pizzariaapi.models.Pizza;
import com.pizzariaapi.repositories.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PizzaService {

    @Autowired
    private PizzaRepository pizzaRepository;

    public Pizza save(Pizza pizza) {
        pizza = this.pizzaRepository.save(pizza);
        return pizza;
    }

    public List<Pizza> findAll() {
        List<Pizza> pizzas = this.pizzaRepository.findAll();
        return pizzas;
    }

    public Pizza findById(Long id){
        Optional<Pizza> resultado = this.pizzaRepository.findById(id);
        if(resultado.isEmpty()) {
            throw new RuntimeException("A pizza não foi encontrada");
        }else {
            return resultado.get();
        }
    }

    public Pizza deleteById(Long id){
        Pizza pizza = findById(id);
        this.pizzaRepository.delete(pizza);
        return pizza;
    }

    public Pizza updateById(Long id, Pizza pizza){
        this.findById(id);
        pizza.setId(id);
        pizza = this.pizzaRepository.save(pizza);
        return pizza;
    }

}
