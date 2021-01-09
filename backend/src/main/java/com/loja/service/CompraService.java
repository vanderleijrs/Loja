package com.loja.service;

import com.loja.controller.request.CompraRequest;
import com.loja.entity.Compra;
import com.loja.repository.CompraRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class CompraService {

    private CompraRepository compraRepository;
    private CompraConverterService compraConverterService;


    CompraService(CompraRepository repository, CompraConverterService compraConverter) {
        this.compraRepository = repository;
        this. compraConverterService = compraConverter;
    }

    public Compra create(CompraRequest compraRequest) {
        Compra compra=  compraConverterService.converter(compraRequest);
        return compraRepository.save(compra);
    }

    public Optional<Compra>getCompra(int codigo) {
        return compraRepository.findById(codigo);
    }
}
