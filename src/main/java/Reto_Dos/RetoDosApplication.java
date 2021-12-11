package Reto_Dos;

import Reto_Dos.interfaces.InterfaceCosmetics;
import Reto_Dos.interfaces.InterfaceUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;
@Component
@SpringBootApplication
public class RetoDosApplication implements CommandLineRunner {
    @Autowired
    private InterfaceCosmetics interfaceCosmetics;
    @Autowired
    private InterfaceUser interfaceUser; 
	public static void main(String[] args) {
		SpringApplication.run(RetoDosApplication.class, args);
	}
        @Override
    public void run(String...args) throws Exception {
        interfaceCosmetics.deleteAll();
        interfaceUser.deleteAll();
        }
}
