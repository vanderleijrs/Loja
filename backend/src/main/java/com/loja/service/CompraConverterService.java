package com.loja.service;

import com.loja.controller.request.CompraRequest;
import com.loja.entity.Compra;
import org.springframework.stereotype.Service;

@Service
public class CompraConverterService {
    public Compra converter(CompraRequest compraRequest) {
        return Compra.builder()
                .cliente(compraRequest.getCliente())
                .descricao(compraRequest.getDescricao())
                .dataCompra(compraRequest.getDataCompra())
                .valorUnitario(compraRequest.getValorUnitario())
                .quantidade(compraRequest.getQuantidade())
                .valorTotal(compraRequest.getValorUnitario() * compraRequest.getQuantidade())
                .build();
    }
}
