package com.loja.controller.request;

import com.loja.entity.Cliente;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CompraRequest {
    private Cliente cliente;
    private String descricao;
    private String dataCompra;
    private double valorUnitario;
    private int quantidade;
    private double valorTotal;
}
