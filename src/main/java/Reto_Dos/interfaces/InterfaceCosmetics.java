/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Reto_Dos.interfaces;

import Reto_Dos.modelo.Cosmetics;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author Equipo
 */
public interface InterfaceCosmetics extends MongoRepository<Cosmetics, String> {
    }
