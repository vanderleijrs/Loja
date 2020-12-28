package com.loja.service;

import com.loja.controller.request.ClienteRequest;
import com.loja.entity.Cliente;
import com.loja.repository.ClienteRepository;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class ClienteService {

    private ClienteRepository clienteRepository;
    private ClienteConverterService clienteConverterService;


    ClienteService(ClienteRepository repository, ClienteConverterService clienteConverter) {
        this.clienteRepository = repository;
        this.clienteConverterService = clienteConverter;
    }



    public Cliente create(ClienteRequest clienteRequest) {
        Cliente  cliente= clienteConverterService.converter(clienteRequest);
        return clienteRepository.save(cliente);
    }

    public Optional<Cliente> getCliente(int codigo) {
        return clienteRepository.findById(codigo);
    }

    }


