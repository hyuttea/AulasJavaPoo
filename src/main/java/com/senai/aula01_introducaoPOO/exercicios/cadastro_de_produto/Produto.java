package com.senai.aula01_introducaoPOO.exercicios.cadastro_de_produto;

public class Produto {
    String nome;
    double preco;
    int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void exibirDetalhes(){

    }
    public void atualizaEstoque(int quantidadeRecebida){
        quantidade += quantidadeRecebida;
        System.out.println("Estoque atual"+ quantidade);
    }
    public void calculaValorEstoque(){
        System.out.println(preco*quantidade);
    }
}



