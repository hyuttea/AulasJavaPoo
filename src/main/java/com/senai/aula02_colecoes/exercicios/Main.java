package com.senai.aula02_colecoes.exercicios;

import java.util.Scanner;

public class Main {
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
                adicionarTarefa();
                break;
            case 2:
                listarTarefas();
                break;
            case 3:
                tarefaConcluida();
                break;
            case 4:
                System.out.println("Você saiu com exito");
                break;
            default:
                System.out.println("Opção Invalida!");
        }
    }

    private static void tarefaConcluida() {
    }

    private static void listarTarefas() {
    }

    private static void adicionarTarefa() {
    }
}
