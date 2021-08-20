package com.loja.exception;

public class ClienteNotFoundException extends RuntimeException {
    private int id;

    public ClienteNotFoundException(int id) {
        this.id = id;
    }
    @Override
    public String getMessage() {
        return String.format("Cliente não encontrado");
    }
}
