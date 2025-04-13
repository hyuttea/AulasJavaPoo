package com.senai.aula06_abstracao.exercicios.gerenciamento_de_eventos;

public class Competicao extends Evento{

    public Competicao(String nome, int horarioInicio, int horarioFinal) {
        super(nome, horarioInicio, horarioFinal);
    }

    @Override
    void inicio() {
        super.inicio();
    }

    @Override
    void encerramento() {
        super.encerramento();
    }

    @Override
    void premiar() {
        super.premiar();
    }
}
