package com.senai.aula02_colecoes.exercicios.tarefa;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Tarefa> listaDeTarefas = new ArrayList<>();

    public static void main(String[] args) {

        int opcoes = 0;
        do {
        System.out.println("---Gerenciador de Tarefas---");
        System.out.println("\t1. Adicionar Tarefa ");
        System.out.println("\t2. Listar Tarefas");
        System.out.println("\t3. Marcar Tarefa Como concluida");
        System.out.println("\t4. Remover Tarefa");
        System.out.println("\t5. Sair");
        System.out.print("Escolha uma opção: ");

            opcoes = scanner.nextInt();
            scanner.nextLine();
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
                    removerTarefa();
                    break;
                case 5:
                    System.out.println("Você saiu com exito");
                    break;
            }
        } while (opcoes != 5);
    }

    private static void adicionarTarefa() {
        System.out.println("Digite o nome da tarefa: ");
        String nomeDaTarefa = scanner.nextLine();

        listaDeTarefas.add(new Tarefa(nomeDaTarefa));
    }

    private static void listarTarefas() {
        listaDeTarefas.forEach(System.out::println);
    }

    private static void tarefaConcluida() {
        listarTarefas();
        System.out.println("Escolha uma tarefa para marcar como concluida:");
    }

    private static void removerTarefa() {

    }
}




