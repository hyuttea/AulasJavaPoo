package com.senai.aula06_abstracao.exercicios.gerenciamento_de_eventos;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Evento> listaDeEventos = new ArrayList<>();
        listaDeEventos.add(new EventoSocial("yyy",10,12,100));
        listaDeEventos.add(new DesafioRelampago("Muito Rapido",14,15));
        listaDeEventos.add(new Competicao("uuuu",20,21));

        listaDeEventos.forEach(evento -> {
            evento.inicio();
            evento.premiar();
            evento.encerramento();

        });
    }

}
