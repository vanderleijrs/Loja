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
public class CompraRequest {
    private String data;
    private String descricao;
    private double valorUnitario;
    private int quantidade;
    private double valorTotal;
    private Cliente cliente;
}
