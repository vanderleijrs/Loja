package com.loja.service;

import com.loja.controller.request.ClienteRequest;
import com.loja.controller.request.CompraRequest;
import com.loja.controller.response.CompraResponse;
import com.loja.entity.Compra;
import com.loja.entity.Pagamento;
import com.loja.repository.CompraRepository;
import org.springframework.stereotype.Service;

import java.util.List;
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

    public  Optional<Compra> getCompra(int idCompra) {
        return compraRepository.findById(idCompra);
    }
    public List getAllCompras() {
        return compraRepository.findAll();
    }
    public void update(CompraRequest compraRequest, int idCompra) {
        Compra compra= compraConverterService.converter(compraRequest);
        compra.setIdCompra(idCompra);
        compraRepository.save(compra);
    }

    public void delete(int idCompra) {
        compraRepository.deleteById(idCompra);
    }


}
