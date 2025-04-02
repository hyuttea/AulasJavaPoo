package com.senai.aula06_abstracao.exemplos.ex_classe_abstrata.gerenciador_de_funcionarios;

public  class Main {
    public static void main(String[] args) {
    pagarFuncionarios(new FuncionarioEfetivo("Laura",1000,10));
    pagarFuncionarios(new FuncionarioTemporario("Miguel",100,200,100));
    }
    public static void pagarFuncionarios(Funcionario funcionario){
        System.out.printf("--------pagamento funcionario(a)"+funcionario.nome+"--------");
        funcionario.exibirDados();
        funcionario.aumentarSalario(20);
        funcionario.exibirDados();
        funcionario.calcularBonus();
        funcionario.exibirDados();
    }
}

