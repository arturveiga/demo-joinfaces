package com.example.demo.bean;

import lombok.Getter;
import lombok.Setter;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 * Created by Admin on 23/02/2018.
 */
@ManagedBean
@ViewScoped
public class HelloWord {

    @Getter@Setter
    private String firstName = "";
    @Getter@Setter
    private String lastName = "";

    @PostConstruct
    public void init(){
        System.out.println("teste de bibi");
    }

    public String showGreeting() {
        return "Hello " + firstName + " " + lastName + "!";
    }
}
