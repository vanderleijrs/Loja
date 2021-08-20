package com.loja.controller.request;


import com.loja.entity.Cliente;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.convert.Jsr310Converters;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PagamentoRequest {
    private Cliente cliente;
    private int id_pagamento;
    private double valorPagamento;
    private  String dataPagamento;
}
