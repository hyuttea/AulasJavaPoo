package com.senai.aula04_heranca.exercicios.controle_de_estoque;

public class Produto {
    private String nome;
    private double preco;
    private double quantidade;

    public Produto(String nome, double preco, int quatidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quatidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getQuatidade() {
        return quantidade;
    }

    public void setQuatidade(double quatidade) {
        this.quantidade = quantidade;
    }

    public void exibirInformacoes(){
        System.out.println("nome: "+ nome +"preço: " + preco+"quantidade estoque: "+quantidade);
    }
}
