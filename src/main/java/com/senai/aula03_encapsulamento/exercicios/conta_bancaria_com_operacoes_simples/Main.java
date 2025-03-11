package com.senai.aula03_encapsulamento.exercicios.conta_bancaria_com_operacoes_simples;

public class Main {
    public static void main(String[] args) {
        ContaBancaria contaBancaria1 = new ContaBancaria("Rafael", 100);
        ContaBancaria contaBancaria2 = new ContaBancaria("Giovana", 1000);

        System.out.println("------teste sacar------");
        contaBancaria1.sacar(-10);
        contaBancaria1.sacar(110);
        contaBancaria2.sacar(10);

        System.out.println("------teste depositar------");
        contaBancaria1.depositar(-200);
        contaBancaria2.depositar(200);

        System.out.println("------teste transferir------");
        contaBancaria1.transferencia(100,contaBancaria2);

    }
}
