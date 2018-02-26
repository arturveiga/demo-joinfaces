package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

/**
 * Created by Admin on 23/02/2018.
 */
@Service
public class TesteService {
    @Inject
    private ModeloRepository modeloRepository;

    public void imprimir() {
        Modelo modelo = new Modelo();
        modelo.setDescricao("ZAPZAP");
        modeloRepository.save(modelo);
        System.out.println("eai galera do zap zap");
    }
}
