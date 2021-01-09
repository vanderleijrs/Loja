package com.loja.service;

import com.loja.controller.request.PagamentoRequest;
import com.loja.entity.Pagamento;

import com.loja.repository.PagamentoRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class PagamentoService {

    private PagamentoRepository pagamentoRepository;
    private PagamentoConverterService pagamentoConverterService;


    PagamentoService(PagamentoRepository repository, PagamentoConverterService PagamentoConverter) {
        this.pagamentoRepository = repository;
        this. pagamentoConverterService = pagamentoConverterService;
    }

    public Pagamento create(PagamentoRequest pagamentoRequest) {
        Pagamento pagamento=  pagamentoConverterService.converter(pagamentoRequest);
        return pagamentoRepository.save(pagamento);
    }

    public Optional<Pagamento>getPagamento(int codigo) {
        return pagamentoRepository.findById(codigo);
    }
}
