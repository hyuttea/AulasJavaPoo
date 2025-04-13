package com.senai.aula06_abstracao.exercicios.gerenciamento_de_eventos;

public class DesafioRelampago extends Evento {

    public DesafioRelampago(String nome, int horarioInicio, int horarioFinal) {
        super(nome, horarioInicio, horarioFinal);
    }

    @Override
    void inicio() {
        super.inicio();
    }

    @Override
    void encerramento() {
        System.out.println("Encerrado em 2 minutos");
    }

    @Override
    void premiar() {
        super.premiar();
    }
}
