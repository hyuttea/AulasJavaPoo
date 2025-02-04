package com.senai.aula01_introducaoPOO.exercicios.cadastro_de_produto;

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
        System.out.println();
        System.out.println();

        produto1.exibirDetalhes();
        produto1.atualizaEstoque();
        produto1.calculaValorEstoque();

        produto2.exibirDetalhes();
        produto2.atualizaEstoque();
        produto2.calculaValorEstoque();

    }
}
