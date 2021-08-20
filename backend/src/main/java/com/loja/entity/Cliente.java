package com.loja.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
@Entity
@Table(name = "cliente")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Cliente implements Serializable {
    private static final Long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cliente", unique = true, nullable = false)
    private int id_cliente;
    private String nome;
    @OneToMany(targetEntity=Compra.class,mappedBy = "cliente")
    @JsonManagedReference(value = "id_compra")
    private List<Compra> compra;
    @OneToMany(targetEntity=Pagamento.class, mappedBy = "cliente")
    @JsonManagedReference(value = "id_pagamento")
    private List<Pagamento> pagamento;
}
