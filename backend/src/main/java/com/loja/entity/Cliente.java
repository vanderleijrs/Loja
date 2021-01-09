package com.loja.entity;

import lombok.*;
import javax.persistence.*;
import java.util.List;
@Entity
@Table(name = "cliente")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Integer id;
    private String name;
    @OneToMany(mappedBy = "cliente")
    private List<Compra> compra;
    @OneToMany(mappedBy = "cliente")
    private List<Pagamento> pagamento;
}
