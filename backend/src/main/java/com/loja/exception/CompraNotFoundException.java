package com.loja.exception;

public class CompraNotFoundException extends RuntimeException{
    private int id;
    public CompraNotFoundException(int id){
        this.id = id;
    }
    @Override
    public String getMessage(){
        return String.format("Compra não encontrada");
    }
}
