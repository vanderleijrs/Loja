package com.loja.repository;

import com.loja.entity.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;
@org.springframework.stereotype.Repository
public interface PagamentoRepository extends JpaRepository<Pagamento,Integer> {

}
