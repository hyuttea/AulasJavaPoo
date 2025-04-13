package com.senai.aula06_abstracao.exercicios.sistema_de_pagamento;

public class CarteirasDigitais implements Pagamento{
    @Override
    public void autenticar() {
        System.out.println("Autenticando pela Carteira Digital");
    }
}
