package com.senai.aula06_abstracao.exercicios.gerenciamento_de_eventos;

import com.senai.aula06_abstracao.exercicios.controle_de_entrega.Veiculos;

import java.util.ArrayList;
import java.util.List;

public abstract class Evento {
    private String nome;
    private int horarioInicio;
    private int horarioFinal;
    private String PREMIO = "emblema dourado";

    public Evento(String nome, int horarioInicio, int horarioFinal) {
        this.nome = nome;
        this.horarioInicio = horarioInicio;
        this.horarioFinal = horarioFinal;
    }

    void inicio(){
        System.out.println("Bem vindos ao evento");
    }

    void encerramento(){
        System.out.println("Obrigado por comparecer ao evento");
    }

    void premiar(){
        System.out.println("O vencedor recebeu " + PREMIO);
    }
}
