package com.pizzariaapi.sarvices;

import com.pizzariaapi.models.Cliente;
import com.pizzariaapi.models.Pizza;
import com.pizzariaapi.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente save(Cliente cliente) {
        cliente = this.clienteRepository.save(cliente);
        return cliente;
    }

    public List<Cliente> findAll() {
        List<Cliente> clientes = clienteRepository.findAll();
        return clientes;
    }

    public Cliente findById(Long id) {
        Optional<Cliente> resultado = this.clienteRepository.findById(id);
        if(resultado.isEmpty()) {
            throw new RuntimeException("O cliente não foi encontrada");
        }else {
            return resultado.get();
        }
    }

    public Cliente deleteById(Long id) {
        Cliente cliente = findById(id);
        this.clienteRepository.delete(cliente);
        return cliente;
    }

    public Cliente updateById(Long id, Cliente cliente) {
        this.findById(id);
        cliente.setId(id);
        cliente = this.clienteRepository.save(cliente);
        return cliente;
    }
}
