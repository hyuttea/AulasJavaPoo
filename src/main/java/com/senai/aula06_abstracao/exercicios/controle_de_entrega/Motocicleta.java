package com.senai.aula06_abstracao.exercicios.controle_de_entrega;

public class Motocicleta extends Veiculos{

    public Motocicleta(int velocidadeAtual, int capacidadeMaxCarga, int distanciaDestino) {
        super(velocidadeAtual, capacidadeMaxCarga, distanciaDestino);
    }

    @Override
    double calculoEntrega() {
        return ((double) distanciaDestino /velocidadeAtual)+5;
    }
}
