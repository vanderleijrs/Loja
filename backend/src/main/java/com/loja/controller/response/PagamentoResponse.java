package com.loja.controller.response;

import com.loja.entity.Pagamento;
import lombok.Builder;
import lombok.Value;

@Builder
@Value
public class PagamentoResponse {
    private int pagamentoCode;

    public static PagamentoResponse from(Pagamento pagamento) {

        return PagamentoResponse
                .builder()
                .pagamentoCode(pagamento.getId())
                .build();
    }
}
