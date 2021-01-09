package com.loja.controller;

import com.loja.controller.request.ClienteRequest;
import com.loja.controller.response.ClienteResponse;
import com.loja.entity.Cliente;
import com.loja.exception.ClienteNotFoundException;
import com.loja.service.ClienteService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
    private ClienteService clienteService;

    public ClienteController (ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)

    public ClienteResponse create(@RequestBody ClienteRequest clienteRequest) {
        Cliente cliente= clienteService.create(clienteRequest);
        return ClienteResponse.builder().clienteCode(cliente.getId()).build();
    }

    @GetMapping(path = "/{name}")
    @ResponseStatus(HttpStatus.OK)
    public Cliente get(@PathVariable int id) {
        return clienteService.getCliente(id)
                .orElseThrow(() -> new ClienteNotFoundException(1));
    }
}
