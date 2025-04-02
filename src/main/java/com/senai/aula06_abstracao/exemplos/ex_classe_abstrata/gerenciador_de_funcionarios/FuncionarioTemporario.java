package com.senai.aula06_abstracao.exemplos.ex_classe_abstrata.gerenciador_de_funcionarios;

public class FuncionarioTemporario extends Funcionario{
    private int horasExtras;
    private double valorHorasExtras;

    public FuncionarioTemporario(String nome, double salario, int horasExtras, double valorHorasExtras) {
        super(nome, salario);
        this.horasExtras = horasExtras;
        this.valorHorasExtras = valorHorasExtras;
    }

    @Override
    public double calcularBonus() {
        return salario += horasExtras*valorHorasExtras;
    }
}
