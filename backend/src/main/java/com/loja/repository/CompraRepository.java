package com.loja.repository;
import com.loja.entity.Compra;
import org.springframework.data.jpa.repository.JpaRepository;
@org.springframework.stereotype.Repository
public interface CompraRepository extends JpaRepository<Compra,Integer> {

}
