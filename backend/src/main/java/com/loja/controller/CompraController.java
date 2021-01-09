package com.loja.controller;


import com.loja.controller.request.CompraRequest;
import com.loja.controller.response.CompraResponse;
import com.loja.entity.Compra;
import com.loja.exception.ClienteNotFoundException;
import com.loja.service.CompraService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Compra")
public class CompraController {

    private CompraService compraService;

    public CompraController (CompraService compraService) {
        this.compraService = compraService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)

    public CompraResponse create(@RequestBody CompraRequest compraRequest) {
        Compra compra = compraService.create(compraRequest);
        return CompraResponse.builder().compraCode(compra.getId()).build();
    }

    @GetMapping(path = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Compra get(@PathVariable int id) {
        return compraService.getCompra(id)
                .orElseThrow(() -> new ClienteNotFoundException(id));
    }
}
