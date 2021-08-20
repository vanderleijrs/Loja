package com.loja.controller;

import com.loja.controller.request.ClienteRequest;
import com.loja.controller.request.PagamentoRequest;
import com.loja.controller.response.PagamentoResponse;
import com.loja.entity.Pagamento;
import com.loja.exception.PagamentoNotFoundException;
import com.loja.service.PagamentoService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/pagamento")
public class PagamentoController {
    private PagamentoService pagamentoService;

    public PagamentoController (PagamentoService pagamentoService) {
        this.pagamentoService = pagamentoService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public PagamentoResponse create(@RequestBody PagamentoRequest pagamentoRequest) {
        Pagamento pagamento = pagamentoService.create(pagamentoRequest);
        return PagamentoResponse.builder().pagamentoCode(pagamento.getIdPagamento()).build();
    }

    @GetMapping(value="/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Pagamento get(@PathVariable int id) {
        return pagamentoService.getPagamento(id)
                .orElseThrow(() -> new PagamentoNotFoundException(id));
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List getAll() {
        return pagamentoService.getAllPagamentos();
    }

    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public void put(@RequestParam int idPagamento,@RequestBody PagamentoRequest pagamentoRequest){
        pagamentoService.update(pagamentoRequest,idPagamento);
    }

    @DeleteMapping
    public void delete(@RequestParam int idPagamento){
        pagamentoService.delete(idPagamento);
    }

}
