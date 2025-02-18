package com.senai.aula02_colecoes.exercicios.tarefa;

public class Tarefa {
    String nomeTarefa;
    boolean status;

    public Tarefa(String nomeTarefa) {
        this.nomeTarefa = nomeTarefa;
        this.status = false; //tarefa começa falso
    }
    @Override
    public String toString() {
        return nomeTarefa+" - ["+ (status?"Concluido":"Pendente")+"]";
    }
}
