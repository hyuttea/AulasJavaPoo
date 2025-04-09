package com.senai.aula06_abstracao.exercicios.controle_de_entrega;

public class Bicicleta extends Veiculos{


    public Bicicleta(int velocidadeAtual, int capacidadeMaxCarga, int distanciaDestino) {
        super(velocidadeAtual, capacidadeMaxCarga, distanciaDestino);
    }

    @Override
    void verificarVelocidadeAtual() {
        System.out.println("Bicicleta: voce chego ao seu destino");
    }

    @Override
    void verificarDistancia() {
        System.out.println("Bicicleta: Velocidade maxima 10km/h");
    }

}
