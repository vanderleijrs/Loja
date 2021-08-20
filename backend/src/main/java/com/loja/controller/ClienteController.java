package com.loja.controller;

import com.loja.controller.request.ClienteRequest;
import com.loja.controller.response.ClienteResponse;
import com.loja.entity.Cliente;
import com.loja.exception.ClienteNotFoundException;
import com.loja.service.ClienteService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
    private ClienteService clienteService;
    private ClienteNotFoundException clienteNotFoundException;
    public ClienteController (ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ClienteResponse create(@RequestBody ClienteRequest clienteRequest) {
        Cliente cliente= clienteService.create(clienteRequest);
        return ClienteResponse.builder().clienteCode(cliente.getId_cliente()).build();
    }

    @GetMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional get(@PathVariable int id) {
        return clienteService.getCliente(id);
    }
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List get() {
        return clienteService.getAllClientes();
    }
    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public void put(@RequestParam int id_cliente,@RequestBody ClienteRequest clienteRequest){
           clienteService.update(clienteRequest,id_cliente);
    }
    @DeleteMapping
    public void delete(@RequestParam int id_cliente){
        clienteService.delete(id_cliente);
    }
}
