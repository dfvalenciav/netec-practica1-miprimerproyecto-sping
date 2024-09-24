/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.miprimerprooyecto;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * @author Daniel Valencia
 */
@SpringBootApplication
public class Miprimerprooyecto implements CommandLineRunner {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        SpringApplication.run(Miprimerprooyecto.class, args);
    }
    @Override
    public void run(String... args) throws Exception{
        System.out.println("Bienvenido a mi aplicativo con Spring");
    }
}
