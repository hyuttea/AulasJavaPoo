package com.senai.aula06_abstracao.exemplos.ex_interface.aparelho_eletronico;

public class Main {
    public static void main(String[] args) {
        testeAparelho(new Televisao());
        testeAparelho(new Computador());
    }
    private static void testeAparelho(AparelhoEletronico aparelhoEletronico){
        aparelhoEletronico.ligar();
        aparelhoEletronico.desligar();
    }
}
