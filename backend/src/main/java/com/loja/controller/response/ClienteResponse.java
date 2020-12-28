package com.loja.controller.response;

import com.loja.entity.Cliente;
import lombok.Builder;
import lombok.Value;

@Builder
@Value
public class ClienteResponse {
    private int clienteCode;

    public static ClienteResponse from(Cliente cliente) {

        return ClienteResponse
                .builder()
                    .clienteCode(cliente.getId())
                .build();
    }
}
