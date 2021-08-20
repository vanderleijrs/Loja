package com.loja.controller.response;

import com.loja.entity.Cliente;
import com.loja.entity.Compra;
import com.loja.entity.Pagamento;
import lombok.Builder;
import lombok.Value;

import java.util.List;

@Builder
@Value
public class ClienteResponse {
    private int clienteCode;
    private List<Compra> compra;
    private List<Pagamento> pagamento;

    public static ClienteResponse from(Cliente cliente) {
        return ClienteResponse
                .builder()
                    .clienteCode(cliente.getId_cliente())
                    .compra(cliente.getCompra())
                    .pagamento(cliente.getPagamento())
                    .build();
    }
}
