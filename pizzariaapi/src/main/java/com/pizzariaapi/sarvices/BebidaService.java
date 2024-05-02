package com.pizzariaapi.sarvices;


import com.pizzariaapi.models.Bebida;
import com.pizzariaapi.models.Pizza;
import com.pizzariaapi.repositories.BebidaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BebidaService {

    @Autowired
    private BebidaRepository bebidaRepository;

    public Bebida save(Bebida bebida) {
        bebida = this.bebidaRepository.save(bebida);
        return bebida;
    }

    public List<Bebida> findAll() {
        List<Bebida> bebidas = this.bebidaRepository.findAll();
        return bebidas;
    }

    public Bebida findById(Long id){
        Optional<Bebida> resultado = this.bebidaRepository.findById(id);
        if(resultado.isEmpty()) {
            throw new RuntimeException("Bebida não foi encontrada");
        }else {
            return resultado.get();
        }
    }

    public Bebida deleteById(Long id){
        Bebida bebida = findById(id);
        this.bebidaRepository.delete(bebida);
        return bebida;
    }

    public Bebida updateById(Long id, Bebida bebida){
        this.findById(id);
        bebida.setId(id);
        bebida = this.bebidaRepository.save(bebida);
        return bebida;
    }

}
