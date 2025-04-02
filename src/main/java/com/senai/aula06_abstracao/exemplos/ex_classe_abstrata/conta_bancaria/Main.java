package com.senai.aula06_abstracao.exemplos.ex_classe_abstrata.conta_bancaria;

public class Main {
    public static void main(String[] args) {
    testarContas(new ContaCorrente("Miguel",100));
    testarContas(new ContaPoupanca("Giovana",1000));
    }
    public static void testarContas(ContaBancaria contaBancaria){
        contaBancaria.exibirSaldo();
        contaBancaria.aplicarTaxaMensal();
        contaBancaria.exibirSaldo();
    }
}
