package com.senai.aula05_polimorfismo.exercicios.gestao_de_produtos;

public class ProdutoServico extends Produto{

    private double impostoS = 0.20;

    public ProdutoServico(String nome, double preco, double imposto) {
        super(nome, preco);
        this.impostoS = imposto;
    }

    @Override
    public double calcularImposto() {
        return preco-(1 + impostoS);

    }
}
