package com.senai.aula04_heranca.exercicios.sistema_de_funcionarios;

public class Main {
    public static void main(String[] args) {
    Funcionario funcionario = new Funcionario("Elise",1300);
    Professor professor = new Professor("Carlos",1500,"Lingua Portuguesa");
    Coordenador coordenador = new Coordenador("Margarette",3000,"Equipe 01");

    professor.exibirInformacoes();
    funcionario.exibirInformacoes();
    coordenador.exibirInformacoes();
    }
}
