package com.senai.aula06_abstracao.exemplos.ex_interface.veiculo;

public interface Veiculo {
    void acelerar();

    default void buzinar(){
        System.out.println("BI BI");
    }
}
