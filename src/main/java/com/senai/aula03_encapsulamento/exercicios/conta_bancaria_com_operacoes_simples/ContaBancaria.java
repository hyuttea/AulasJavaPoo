package com.senai.aula03_encapsulamento.exercicios.conta_bancaria_com_operacoes_simples;

public class ContaBancaria {
    private String titular;
    private double saldo;

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

    public void sacar(double valor){
        if (valor >0 && valor <= saldo){
            saldo -= valor;
            System.out.println("Saque realizado com sucesso! Valor atual R$" + saldo);
        }else{
            System.out.println("Saldo insuficiente!");
        }
    }

    public void depositar(double valor){
    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "titular='" + titular + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}


