package com.loja.controller.response;

import com.loja.entity.Compra;
import lombok.Builder;
import lombok.Value;

import java.time.LocalDate;

@Builder
@Value
public class CompraResponse {
    private int compraCode;
    private String descricao;
    private String dataCompra;
    private double valorUnitario;
    private int quantidade;
    private double valorTotal;
    public static CompraResponse from(Compra compra) {
        return CompraResponse
                .builder()
                .compraCode(compra.getIdCompra())
                .build();
    }
}
