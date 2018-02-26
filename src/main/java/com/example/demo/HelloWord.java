package com.example.demo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 * Created by Admin on 23/02/2018.
 */
@ManagedBean
@Controller
@ViewScoped
public class HelloWord {
    @Autowired
    private TesteService testeService;
    @Getter@Setter
    private String firstName = "";
    @Getter@Setter
    private String lastName = "";

    @PostConstruct
    public void init(){
        System.out.println("teste de bibi");
    }

    public String showGreeting() {
        testeService.imprimir();
        return "Hello " + firstName + " " + lastName + "!";
    }
}
