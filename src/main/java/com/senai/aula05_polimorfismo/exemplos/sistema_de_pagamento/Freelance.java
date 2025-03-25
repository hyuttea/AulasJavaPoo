package com.senai.aula05_polimorfismo.exemplos.sistema_de_pagamento;

public class Freelance extends Pagamentos{
    private double valorProjeto;

    public Freelance(String nome, double valorProjeto) {
        super(nome);
        this.valorProjeto = valorProjeto;
    }

    @Override
    public double calcularPagamento() {
        return valorProjeto;
    }
}
