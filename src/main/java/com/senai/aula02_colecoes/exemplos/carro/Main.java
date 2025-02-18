package com.senai.aula02_colecoes.exemplos.carro;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //fazer menu

        Scanner scanner = new Scanner(System.in);
        ArrayList<Carro> listaDeCarros = new ArrayList<>(); //"<>" pode guardar tudo então especificar qual tipo de dado é a lista

        System.out.println("Quantos Carros Deseja Inserir no Sistema?");
        int qtdCarros = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Preencha as informações a seguir");

        for (int i = 0; i < qtdCarros; i++) {
            System.out.println("\nCarro"+(i+1)+"\n");

            System.out.println("Modelo: ");
            String modelo = scanner.nextLine();

            System.out.println("Fabricante: ");
            String fabricante = scanner.nextLine();

            System.out.println("Cor: ");
            String cor = scanner.nextLine();

            System.out.println("Ano: ");
            int ano = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Valor: ");
            double valorInicial = scanner.nextDouble();
            scanner.nextLine();

            listaDeCarros.add(new Carro(modelo,fabricante,cor,ano,valorInicial));
        }
        listaDeCarros.forEach(System.out::println); //forEach: vai no primeiro item e passa como parametro a função
    }
}
