package com.loja.controller;

import com.loja.controller.request.ClienteRequest;
import com.loja.controller.request.CompraRequest;
import com.loja.controller.response.CompraResponse;
import com.loja.entity.Compra;
import com.loja.exception.CompraNotFoundException;
import com.loja.service.CompraService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value="/compra")
public class CompraController {

    private CompraService compraService;

    public CompraController (CompraService compraService) {
        this.compraService = compraService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CompraResponse create(@RequestBody CompraRequest compraRequest) {
       Compra compra= compraService.create(compraRequest);
        return CompraResponse.builder().compraCode(compra.getIdCompra()).build();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Compra get(@PathVariable int id) {
        return compraService.getCompra(id)
               .orElseThrow(() -> new CompraNotFoundException(id));
    }
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List get() {
        return compraService.getAllCompras();
    }

    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public void put(@RequestParam int id_compra,@RequestBody CompraRequest compraRequest){
        compraService.update(compraRequest,id_compra);
    }
    @DeleteMapping
    public void delete(@RequestParam int id_compra){
        compraService.delete(id_compra);
    }
}
