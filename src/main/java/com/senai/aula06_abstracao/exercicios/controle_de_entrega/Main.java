package com.senai.aula06_abstracao.exercicios.controle_de_entrega;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Veiculos> listaDeVeiculos = new ArrayList<>();

        listaDeVeiculos.add(new Motocicleta(15, 100,70));
        listaDeVeiculos.add(new Bicicleta(7,50,30));

        listaDeVeiculos.forEach(veiculos-> {

           veiculos.verificarVelocidadeAtual();
           veiculos.verificarDistancia();
           veiculos.aumentarVelocidade(40);

        });
    }
}
