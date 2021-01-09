package com.loja.controller.response;

import com.loja.entity.Compra;
import lombok.Builder;
import lombok.Value;

@Builder
@Value
public class CompraResponse {
    private int compraCode;

    public static CompraResponse from(Compra compra) {

        return CompraResponse
                .builder()
                .compraCode(compra.getId())
                .build();
    }
}
