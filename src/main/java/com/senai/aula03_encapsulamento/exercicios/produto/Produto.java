package com.senai.aula03_encapsulamento.exercicios.produto;

public class Produto {
    public String nome;
    public double preco;

    public Produto() {
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        if (preco <= 0) {
            this.preco = preco;
        } else {
            System.out.println("invalido");
        }
    }
}
