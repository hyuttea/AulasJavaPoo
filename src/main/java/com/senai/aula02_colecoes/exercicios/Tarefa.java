package com.senai.aula02_colecoes.exercicios;

public class Tarefa {
    String nomeTarefa;
    boolean status;

    public Tarefa(String nomeTarefa) {
        this.nomeTarefa = nomeTarefa;
        this.status = false; //tarefa começa falso
    }

    @Override
    public String toString() {
        return "Tarefa{" +
               "nomeTarefa='" + nomeTarefa + '\'' +
               ", status=" + status +
               '}';
    }
}
