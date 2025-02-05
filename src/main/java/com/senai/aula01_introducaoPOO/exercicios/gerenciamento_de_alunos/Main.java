package com.senai.aula01_introducaoPOO.exercicios.gerenciamento_de_alunos;

import java.util.Scanner;

public class Main {
    static Aluno[] alunos = new Aluno[3];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcoes = 0;
        System.out.println("O que deseja fazer?");
        System.out.println("\t1- Exibir Informaçoes dos Alunos");
        System.out.println("\t2- Atualizar Nota");
        System.out.println("\t3- Verificar Aprovação");
        System.out.println("\t4- Sair");

        switch (opcoes) {
            case 1:
            exibirAlunos();
                break;
            case 2:

                break;
            case 3:

                break;
            case 4:
                System.out.println("Você saiu com exito");
                break;
        }

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

        alunos[0] = aluno1;
        alunos[1] = aluno2;
        alunos[2] = aluno3;


        System.out.println();
        System.out.println();
        System.out.println();
        aluno1.exibirInformacoes();
        aluno1.verificaAprovacao();
        aluno1.atualizaNota(6.9);

        aluno2.exibirInformacoes();
        aluno2.verificaAprovacao();
        aluno2.atualizaNota(8.5);

        aluno3.exibirInformacoes();
        aluno3.verificaAprovacao();
        aluno3.atualizaNota(2.4);
    }

    public static void exibirAlunos(){
        for (int i = 0; i <alunos.length ; i++) {
            alunos[i].exibirInformacoes();
        }
    }
    public static void cadastroDeAlunos(){
    }
}



