package com.senai.aula06_abstracao.exemplos.ex_classe_abstrata.gerenciador_de_funcionarios;

public abstract class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }
    public void aumentarSalario(double porcentagemDeAumento){
        salario += salario*porcentagemDeAumento/100;
    }
    public abstract double calcularBonus();

    public void exibirDados(){
        System.out.printf("\n%s recebe R$%,.2f\n", nome, salario);
    }
}

