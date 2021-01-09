package com.loja.service;


import com.loja.controller.request.PagamentoRequest;

import com.loja.entity.Pagamento;
import org.springframework.stereotype.Service;

@Service
public class PagamentoConverterService {
    public Pagamento converter(PagamentoRequest pagamento) {
        return Pagamento.builder().valor(pagamento.getValor()).data(pagamento.getData()).build();
    }
}



