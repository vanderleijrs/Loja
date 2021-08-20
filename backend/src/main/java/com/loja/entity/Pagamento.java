package com.loja.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.springframework.data.convert.Jsr310Converters;

import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Entity
@Table(name = "pagamento")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Pagamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPagamento;
    private double valorPagamento;
    @Column(name="data_pagamento")
    private String dataPagamento;
    @ManyToOne(fetch = FetchType.LAZY, targetEntity = Cliente.class)
    @JsonBackReference(value = "id_pagamento")
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;
}