package com.pizzariaapi.controlles;

import com.pizzariaapi.models.Bebida;
import com.pizzariaapi.models.Pizza;
import com.pizzariaapi.sarvices.BebidaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BebidaController {
    @Autowired
    private BebidaService bebidaService;

    @RequestMapping(value = "bebidas", method = RequestMethod.POST)
    public Bebida save(@RequestBody Bebida bebida) {
        return this.bebidaService.save(bebida);
    }

    @RequestMapping(value = "/bebidas", method = RequestMethod.GET)
    public List<Bebida> findAll() {
        return this.bebidaService.findAll();
    }


    @RequestMapping(value = "/bebidas/{id}", method = RequestMethod.GET)
    public Bebida findById(@PathVariable Long id) {
        return this.bebidaService.findById(id);
    }

    @RequestMapping(value = "/bebidas/{id}", method = RequestMethod.DELETE)
    public Bebida deleteById(@PathVariable Long id) {
        return this.bebidaService.deleteById(id);
    }

    @RequestMapping(value = "/bebida/{id}", method = RequestMethod.PUT)
    public Bebida updateById(@PathVariable Long id, @RequestBody Bebida bebida) {
        return this.bebidaService.updateById(id, bebida);
    }


}
