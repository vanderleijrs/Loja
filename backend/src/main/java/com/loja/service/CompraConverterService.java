package com.loja.service;

import com.loja.controller.request.CompraRequest;
import com.loja.entity.Compra;
import org.springframework.stereotype.Service;

@Service
public class CompraConverterService {
    public Compra converter(CompraRequest compra) {
        return Compra.builder().descricao(compra.getDescricao()).data(compra.getData())
                .valorUnitario(compra.getValorUnitario()).quantidade(compra.getQuantidade()).build();
    }
}
