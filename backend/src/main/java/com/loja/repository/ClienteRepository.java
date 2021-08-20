package com.loja.repository;

import com.loja.controller.request.ClienteRequest;
import com.loja.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

@org.springframework.stereotype.Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}




