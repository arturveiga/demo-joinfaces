package com.example.demo.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by Admin on 23/02/2018.
 */

@Entity
@Data
public class Modelo {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String descricao;
}
