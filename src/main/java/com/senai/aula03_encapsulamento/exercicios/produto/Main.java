package com.senai.aula03_encapsulamento.exercicios.produto;

public class Main {
    public static void main(String[] args) {
    Produto produto = new Produto();

    produto.setPreco(12);
        System.out.println("Preço do produto: " + produto.getPreco());
    }
}
