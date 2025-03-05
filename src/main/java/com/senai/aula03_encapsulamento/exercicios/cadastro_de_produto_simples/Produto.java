package com.senai.aula03_encapsulamento.exercicios.cadastro_de_produto_simples;

import java.util.Objects;

public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) { //O construtor só roda uma vez
        this.nome = nome;
        if (preco >= 0) {
            this.preco = preco;
        }else {
            System.out.println("O preço do produto não pode ser negativo");
            System.out.println("O preço do produto será atribuido como R$0,0");
        }
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
        if (preco >= 0) {
            this.preco = preco;
        }else {
            System.out.println("O preço do produto não pode ser negativo");
        }
    }

    @Override
    public boolean equals(Object o) { //antes do toString | Object o = recebe qualquer coisa
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return Double.compare(preco, produto.preco) == 0 && Objects.equals(nome, produto.nome);
    }

    @Override
    public int hashCode() { //por antes do toString
        return Objects.hash(nome, preco);
    }

    @Override
    public String toString() { //toString
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }
}

