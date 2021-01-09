package com.loja.controller;

import com.loja.controller.request.PagamentoRequest;
import com.loja.controller.response.ClienteResponse;
import com.loja.controller.response.PagamentoResponse;
import com.loja.entity.Pagamento;
import com.loja.exception.ClienteNotFoundException;
import com.loja.service.PagamentoService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

public class PagamentoController {
    private PagamentoService pagamentoService;

    public PagamentoController (PagamentoService pagamentoService) {
        this.pagamentoService = pagamentoService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)

    public PagamentoResponse create(@RequestBody PagamentoRequest pagamentoRequest) {
        Pagamento pagamento= pagamentoService.create(pagamentoRequest);
        return PagamentoResponse.builder().pagamentoCode(pagamento.getId()).build();
    }

    @GetMapping(path = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Pagamento get(@PathVariable int id) {
        return pagamentoService.getPagamento(id)
                .orElseThrow(() -> new ClienteNotFoundException(1));
    }
}
