package com.loja.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "compra")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Compra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private int id;
    private String data;
    private String descricao;
    private double valorUnitario;
    private int quantidade;
    @ManyToOne
    @JoinColumn(name="id")
    private Cliente cliente;
}
