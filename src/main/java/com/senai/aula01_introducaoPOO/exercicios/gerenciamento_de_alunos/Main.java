package com.senai.aula01_introducaoPOO.exercicios.gerenciamento_de_alunos;

public class Main {
    public static void main(String[] args) {
    Aluno aluno1 = new Aluno(
            "Laura",
            18,
            5.0
    );
    Aluno aluno2 = new Aluno(
            "oto",
            23,
            8.0

    );
    Aluno aluno3 = new Aluno(
            "Guilherme",
            14,
            6.0

    );
        System.out.println();
        System.out.println();
        System.out.println();
        aluno1.exibirInformacoes();
        aluno1.verificaAprovacao();

        aluno2.exibirInformacoes();
        aluno2.verificaAprovacao();

        aluno3.exibirInformacoes();
        aluno3.verificaAprovacao();
    }

}
