package com.example.demo.repository;

import com.example.demo.model.Modelo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Admin on 23/02/2018.
 */
@Repository
public interface ModeloRepository extends JpaRepository<Modelo,Long> {
}