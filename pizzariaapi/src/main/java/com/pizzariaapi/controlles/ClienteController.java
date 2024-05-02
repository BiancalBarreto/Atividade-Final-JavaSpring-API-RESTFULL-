package com.pizzariaapi.controlles;

import com.pizzariaapi.models.Cliente;
import com.pizzariaapi.sarvices.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @PostMapping("/clientes")
    public Cliente save(@RequestBody Cliente cliente) {
        return this.clienteService.save(cliente);
    }

    @GetMapping("/clientes")
    public List<Cliente> findAll(){
        return this.clienteService.findAll();
    }

    @GetMapping("/clientes{id}")
    public Cliente findById(@PathVariable Long id) {
        return this.clienteService.findById(id);
    }

    @DeleteMapping("/cliente/{id}")
    public Cliente deleteById(@PathVariable Long id) {
        return this.clienteService.deleteById(id);
    }

    @PutMapping("/clientes/{id}")
    public Cliente updateById(@PathVariable Long id, @RequestBody Cliente cliente) {
        return this.clienteService.updateById(id, cliente);
    }




}
