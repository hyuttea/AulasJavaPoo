package com.senai.aula04_heranca.exercicios.sistema_de_funcionarios;

public class Coordenador extends Funcionario{
    private String equipeProfessores;

    public Coordenador(String nome, double salario, String equipeProfessores) {
        super(nome, salario);
        this.equipeProfessores = equipeProfessores;
    }

    public String getEquipeProfessores() {
        return equipeProfessores;
    }

    public void setEquipeProfessores(String equipeProfessores) {
        this.equipeProfessores = equipeProfessores;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("\nNome: "+getNome()+"\nSalário: R$"+getSalario()+"\nEquipe de Professores: "+equipeProfessores);
    }
}

