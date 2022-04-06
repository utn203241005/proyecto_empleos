package com.leonardo.camacho.valdez.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leonardo.camacho.valdez.model.Categoria;


//public interface CategoriasRepository extends CrudRepository<Categoria, Integer> 
public interface CategoriasRepository extends JpaRepository<Categoria, Integer>{

}