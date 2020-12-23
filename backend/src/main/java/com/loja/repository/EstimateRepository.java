package com.loja.repository;

import com.loja.entity.Estimate;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface EstimateRepository extends JpaRepository<Estimate, Integer>{

}




