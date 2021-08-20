package com.loja.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

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
    private int idCompra;
    private String descricao;
    private String dataCompra;
    private double valorUnitario;
    private int quantidade;
    private double valorTotal;
   @ManyToOne(fetch = FetchType.LAZY, targetEntity = Cliente.class)
   @JsonBackReference(value = "id_compra")
   @JoinColumn(name = "id_cliente")
   private Cliente cliente;
}
