/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.miprimerprooyecto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Daniel Valencia
 */
@RestController
public class HelloController {
    @GetMapping ("/")
    public String hello () {
        return ("Bienvenido");
    }
}
