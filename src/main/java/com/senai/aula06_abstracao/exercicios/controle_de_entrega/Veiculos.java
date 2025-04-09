package com.senai.aula06_abstracao.exercicios.controle_de_entrega;

public abstract class Veiculos {
    public int velocidadeAtual;
     public static int capacidadeMaxCarga;
     public int distanciaDestino;

    public Veiculos(int velocidadeAtual, int capacidadeMaxCarga, int distanciaDestino) {
        this.velocidadeAtual = velocidadeAtual;
        this.capacidadeMaxCarga = capacidadeMaxCarga;
        this.distanciaDestino = distanciaDestino;
    }

    abstract void verificarVelocidadeAtual();

    abstract void verificarDistancia();

    public void aumentarVelocidade(int valorIncremento){
        velocidadeAtual += valorIncremento;
        System.out.println("Velocidade aumentou para: "+ velocidadeAtual);
    }

}


