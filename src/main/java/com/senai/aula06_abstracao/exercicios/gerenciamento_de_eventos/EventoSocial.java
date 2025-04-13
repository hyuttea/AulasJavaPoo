package com.senai.aula06_abstracao.exercicios.gerenciamento_de_eventos;

public class EventoSocial extends Evento{
    private int premioEmDinheiro;

    public EventoSocial(String nome, int horarioInicio, int horarioFinal, int premioEmDinheiro) {
        super(nome, horarioInicio, horarioFinal);
        this.premioEmDinheiro = premioEmDinheiro;
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
        System.out.println("O premio " + premioEmDinheiro + " foi doado para a caidade");
    }
}
