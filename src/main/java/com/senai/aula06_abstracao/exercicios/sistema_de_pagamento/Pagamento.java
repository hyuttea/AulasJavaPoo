package com.senai.aula06_abstracao.exercicios.sistema_de_pagamento;

 public interface Pagamento {
    void autenticar();

    default void  validar(){
        System.out.println("Validado!");
    }

    default void registra(){
        System.out.println("Registrado!");
    }

}
