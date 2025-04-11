package com.senai.aula04_heranca.exercicios.sistema_de_atendiento_medico;

public class Paciente {
    private String nome;
    private int idade;


    public Paciente(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void exbibirInfos(){
        System.out.println("Nome: " + nome + "| Idade: " + idade);
    }
}
