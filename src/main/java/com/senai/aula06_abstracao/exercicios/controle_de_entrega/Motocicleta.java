package com.senai.aula06_abstracao.exercicios.controle_de_entrega;

public class Motocicleta extends Veiculos{

    public Motocicleta(int velocidadeAtual, int capacidadeMaxCarga, int distanciaDestino) {
        super(velocidadeAtual, capacidadeMaxCarga, distanciaDestino);
    }

    @Override
    void verificarVelocidadeAtual() {
        System.out.println("Motocicleta: Tempo acrescentado por conta do transito");
    }

    @Override
    void verificarDistancia() {
        System.out.println("Motocicleta: 20km para o destino");
    }

}
