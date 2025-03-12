package com.senai.aula04_heranca.exemplos.gerenciamento_de_contas_bancarias;

public class Main {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente("Juliano",1000000,10000);
        ContaPoupanca contaPoupanca = new ContaPoupanca("Giovana", 100, 5);

        System.out.println("-------------");
        contaPoupanca.exibirSaldo();
        contaCorrente.exibirSaldo();
        System.out.println("---teste sacar cc---");
        contaCorrente.sacar(120000);
        contaCorrente.sacar(10500);
        System.out.println("---teste rendimento cp---");
        contaPoupanca.aplicarRendimento();
        System.out.println("---teste saldo---");
        contaPoupanca.exibirSaldo();
        contaCorrente.exibirSaldo();
    }
}
