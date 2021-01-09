package com.loja.controller.request;


import com.loja.entity.Cliente;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class PagamentoRequest {
    private double valor;
    private String data;
    private Cliente cliente;
}
