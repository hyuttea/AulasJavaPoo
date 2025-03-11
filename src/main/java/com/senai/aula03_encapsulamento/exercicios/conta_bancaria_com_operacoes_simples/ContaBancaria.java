package com.senai.aula03_encapsulamento.exercicios.conta_bancaria_com_operacoes_simples;

public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        if (saldo > 0) {
            this.saldo = saldo;
        } else {
            System.out.println("O saldo não pode iniciar negativo, será atribuido ao saldo o seguinte valor: R$0,0");
        }
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            mensagemSucesso("Saque",this);
            return true;
        } else {
            System.out.println("Saldo insuficiente!");
            return false;
        }
    }

    public boolean depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            mensagemSucesso("Depositar", this);
            return true;
        } else {
            System.out.println("Operação Invalida: O valor do deposito deve ser maior que R$0,0");
            return false;
        }
    }

    public static void mensagemSucesso(String operacao, ContaBancaria minhaConta) {
        System.out.println(operacao + " na conta de " + minhaConta.titular + " realizada com sucesso");
        System.out.println("Saldo atual R$" + minhaConta.saldo);
    }

    public void transferencia(double valor, ContaBancaria contaDestino) {
        if (this.sacar(valor)) {
            contaDestino.depositar(valor);
        }
    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "titular='" + titular + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}


