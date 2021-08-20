package com.loja.service;

import com.loja.controller.request.PagamentoRequest;
import com.loja.entity.Cliente;
import com.loja.entity.Pagamento;

import com.loja.repository.PagamentoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class PagamentoService {

    private PagamentoRepository pagamentoRepository;
    private PagamentoConverterService pagamentoConverterService;


    PagamentoService(PagamentoRepository repository, PagamentoConverterService pagamentoConverterService) {
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
    public List getAllPagamentos() {
        return pagamentoRepository.findAll();
    }
    public void update(PagamentoRequest pagamentoRequest, int idPagamento) {
        Pagamento pagamento= pagamentoConverterService.converter(pagamentoRequest);
        pagamento.setIdPagamento(idPagamento);
        pagamentoRepository.save(pagamento);
    }
    public void delete(int idPagamento) {
        pagamentoRepository.deleteById(idPagamento);
    }


}
