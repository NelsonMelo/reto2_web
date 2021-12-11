/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Reto_Dos.interfaces;

import Reto_Dos.modelo.User;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author Equipo
 */
public interface InterfaceUser extends MongoRepository<User, Integer>{
  Optional<User> findByEmail(String email);
    Optional<User> findByEmailAndPassword(String email,String password);  
}
