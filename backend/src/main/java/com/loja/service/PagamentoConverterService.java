package com.loja.service;


import com.loja.controller.request.PagamentoRequest;

import com.loja.entity.Pagamento;
import org.springframework.stereotype.Service;



@Service
public class PagamentoConverterService {
    public Pagamento converter(PagamentoRequest pagamentoRequest) {
        return Pagamento.builder()
                .cliente(pagamentoRequest.getCliente())
                .valorPagamento(pagamentoRequest.getValorPagamento())
                .dataPagamento(pagamentoRequest.getDataPagamento())
                .build();
    }
}



