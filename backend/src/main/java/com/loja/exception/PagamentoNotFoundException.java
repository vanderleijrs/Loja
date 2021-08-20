package com.loja.exception;

public class PagamentoNotFoundException extends RuntimeException{
    private int id;
    public PagamentoNotFoundException(int id){
        this.id = id;
    }
    @Override
    public String getMessage(){
        return String.format("Pagamento não encontrado");
    }
}
