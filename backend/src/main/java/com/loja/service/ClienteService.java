package com.loja.service;

import com.loja.controller.request.ClienteRequest;
import com.loja.entity.Cliente;
import com.loja.repository.ClienteRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
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
    public void  update(ClienteRequest clienteRequest, int id_cliente) {
       Cliente cliente= clienteConverterService.converter(clienteRequest);
       cliente.setId_cliente(id_cliente);
       clienteRepository.save(cliente);

    }
    public List<Cliente> getAllClientes() {
        clienteConverterService.converter(ClienteRequest.builder().build());
        List<Cliente> cliente= clienteRepository.findAll();
        return cliente;
    }
    public Optional getCliente(int id_cliente) {
        clienteConverterService.converter(ClienteRequest.builder().build());
        Optional cliente= clienteRepository.findById(id_cliente);
        return cliente;
    }
   public void delete( int id_cliente){
        clienteRepository.deleteById(id_cliente);
   }
}


