package com.senai.aula06_abstracao.exemplos.ex_classe_abstrata.veiculo;

public class Carro extends Veiculo{
    @Override
    void ligar() {
        System.out.println("Carro ligado");
    }
}
