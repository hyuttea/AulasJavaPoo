package com.senai.aula03_encapsulamento.exercicios.gerenciamento_de_funcionario;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Laura","Professora",1400);
        funcionario.calculoAumento(120);
        funcionario.alterarSalario(1800);

    }
}
