package com.senai.aula01_introducaoPOO.exemplos.Exercicios;

public class Main {
    public static void main(String[] args) {
    Produto produto1 = new Produto(
            "Feijão",
            6.0,
            10
    );
    Produto produto2 = new Produto(
            "Farofa",
            7.0,
            30
    );
        System.out.println(produto1);
        System.out.println(produto2);
    }
}
