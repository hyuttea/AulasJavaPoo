package com.senai.aula04_heranca.exemplos.sistema_de_cadastro_de_funcionarios;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Rafael",1000);
        Gerente gerente = new Gerente("Giovana", 2000,10000);

        funcionario.exibirDados();
        gerente.exibirDados();

    }
}
