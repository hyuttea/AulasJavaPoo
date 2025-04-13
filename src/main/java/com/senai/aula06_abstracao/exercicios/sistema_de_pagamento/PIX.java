package com.senai.aula06_abstracao.exercicios.sistema_de_pagamento;

public class PIX implements Pagamento{
    @Override
    public void autenticar() {
        System.out.println("Autenticando pelo PIX");
    }


}
