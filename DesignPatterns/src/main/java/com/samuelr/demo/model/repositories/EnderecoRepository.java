package com.samuelr.demo.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.samuelr.demo.model.entities.Endereco;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, String>{

}
