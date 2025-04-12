package com.senai.aula03_encapsulamento.exercicios.gerenciamento_de_funcionario;

public class Funcionario {
    private String nome;
    private String cargo;
    private double salario;

    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void alterarSalario(double valor) {
        if (valor > 1320) {
            salario = valor;
            System.out.println("Salário de " + nome + " redefinido para R$" + salario);
        } else {
            System.out.println("Inválido! Valor menor que um salário minimo");
        }
    }

    public void calculoAumento(double aumento) {
        System.out.println("Salário promovido para R$" + (aumento + salario));
    }
}

