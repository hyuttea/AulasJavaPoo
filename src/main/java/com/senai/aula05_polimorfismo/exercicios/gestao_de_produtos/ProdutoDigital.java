package com.senai.aula05_polimorfismo.exercicios.gestao_de_produtos;

public class ProdutoDigital extends Produto{
    private double impostoD = 0.30;

    public ProdutoDigital(String nome, double preco, double imposto) {
        super(nome, preco);
        this.impostoD = imposto;
    }

    @Override
    public double calcularImposto() {
        return preco+(1 + impostoD);
    }
}
