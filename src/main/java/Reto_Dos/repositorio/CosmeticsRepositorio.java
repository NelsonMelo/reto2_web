/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto_Dos.repositorio;

import Reto_Dos.interfaces.InterfaceCosmetics;
import Reto_Dos.modelo.Cosmetics;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Proyecto pedidos revista por catalogo la hermosa Ursula
 * Diciembre 2021 
 * Reto 2 ciclo 4
 * @author Nelson Melo
 */
@Repository
public class CosmeticsRepositorio {
     @Autowired
    private InterfaceCosmetics repository;

    public List<Cosmetics> getAll() {
        return repository.findAll();
    }

    public Optional<Cosmetics> getClothe(String reference) {
        return repository.findById(reference);
    }
    public Cosmetics create(Cosmetics clothe) {
        return repository.save(clothe);
    }

    public void update(Cosmetics clothe) {
        repository.save(clothe);
    }
    
    public void delete(Cosmetics clothe) {
        repository.delete(clothe);
    }
}
