package com.loja.controller.request;

import com.loja.entity.Compra;
import com.loja.entity.Pagamento;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ClienteRequest {
    private int id;
    private String nome;
    private List<Compra> compra;
    private List<Pagamento> pagamento;
}
