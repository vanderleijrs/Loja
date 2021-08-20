package com.loja.controller.response;

import com.loja.entity.Cliente;
import com.loja.entity.Pagamento;
import lombok.Builder;
import lombok.Value;
import org.springframework.data.convert.Jsr310Converters;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Builder
@Value
public class PagamentoResponse {
    private int pagamentoCode;
    private double valorPagamento;
    private String dataPagamento;
    private Cliente cliente;

    public static PagamentoResponse from(Pagamento pagamento) {
        return PagamentoResponse
                .builder()
                .pagamentoCode(pagamento.getIdPagamento())
                .valorPagamento(pagamento.getValorPagamento())
                .dataPagamento(pagamento.getDataPagamento())
                .build();
    }
}
