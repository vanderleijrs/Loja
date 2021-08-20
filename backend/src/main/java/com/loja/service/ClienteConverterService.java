package com.loja.service;

import com.loja.controller.request.ClienteRequest;

import com.loja.entity.Cliente;
import org.springframework.stereotype.Service;

@Service
public class ClienteConverterService {
    public Cliente converter(ClienteRequest clienteRequest) {
        return Cliente.builder()
                .nome(clienteRequest.getNome())
                .pagamento(clienteRequest.getPagamento())
                .compra(clienteRequest.getCompra())
                .build();
    }
}
