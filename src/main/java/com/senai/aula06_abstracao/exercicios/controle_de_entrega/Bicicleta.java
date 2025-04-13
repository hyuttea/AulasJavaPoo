package com.senai.aula06_abstracao.exercicios.controle_de_entrega;

public class Bicicleta extends Veiculos{


    public Bicicleta(int velocidadeAtual, int capacidadeMaxCarga, int distanciaDestino) {
        super(velocidadeAtual, capacidadeMaxCarga, distanciaDestino);
    }

    @Override
    double calculoEntrega() {
        return ((double) distanciaDestino /velocidadeAtual);
    }
}
