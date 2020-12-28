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
    private int id;
    private String data;
    private String descricao;
    private double valorUnitario;
    private int quantidade;
    private Cliente cliente;
}
