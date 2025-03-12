package com.senai.aula04_heranca.exemplos.gerenciamento_de_contas_bancarias;

public class ContaBancaria {
    private String titular;
    protected double saldo;

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
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

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            mensagemSucesso("Saque", this);
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

    public void exibirSaldo() {
            System.out.printf("Titular: %s, Saldo: R$%,.2f\n",titular, saldo);
        }
    }
