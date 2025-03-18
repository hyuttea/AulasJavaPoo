package com.senai.aula04_heranca.exercicios.sistema_de_funcionarios;

public class Professor extends Funcionario{
    private String diciplinas;

    public Professor(String nome, double salario, String diciplinas) {
        super(nome, salario);
        this.diciplinas = diciplinas;
    }

    public String getDiciplinas() {
        return diciplinas;
    }

    public void setDiciplinas(String diciplinas) {
        this.diciplinas = diciplinas;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("\nNome: "+getNome()+"\nSalário: R$"+getSalario()+"\nDiciplina: "+diciplinas);
    }
}
