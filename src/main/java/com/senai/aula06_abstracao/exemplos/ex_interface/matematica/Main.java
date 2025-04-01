package com.senai.aula06_abstracao.exemplos.ex_interface.matematica;

public class Main {
    public static void main(String[] args) {
        int soma = Matematica.somar(5,3);
        System.out.println("A soma é "+ soma);

        System.out.println("O valor de PI é: " + Matematica.PI);
    }
}
