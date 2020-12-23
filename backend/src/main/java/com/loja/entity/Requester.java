package com.loja.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "requester")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Requester {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Integer id;
    private String fullName;
    private String cellphone;
    private String email;
    
}
