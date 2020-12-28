package com.loja.repository;

import com.loja.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
@org.springframework.stereotype.Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}




