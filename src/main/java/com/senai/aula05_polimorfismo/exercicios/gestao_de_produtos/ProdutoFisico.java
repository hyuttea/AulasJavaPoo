package com.senai.aula05_polimorfismo.exercicios.gestao_de_produtos;

public class ProdutoFisico extends Produto{
    private double impostoF = 0.10;

    public ProdutoFisico(String nome, double preco, double imposto) {
        super(nome, preco);
        this.impostoF = imposto;
    }

    @Override
    public double calcularImposto() {
        return preco*(1 + impostoF);
    }
}
