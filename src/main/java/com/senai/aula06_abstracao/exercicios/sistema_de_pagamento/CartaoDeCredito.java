package com.senai.aula06_abstracao.exercicios.sistema_de_pagamento;

public class CartaoDeCredito implements Pagamento{
    @Override
    public void autenticar() {
        System.out.println("Autenticando pelo Cartão de Credito");
    }
}
