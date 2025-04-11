package com.senai.aula04_heranca.exercicios.sistema_de_atendiento_medico;

public class PacienteParticular extends Paciente{
    private int consultaTotal;

    public PacienteParticular(String nome, int idade, int consultaTotal) {
        super(nome, idade);
        this.consultaTotal = consultaTotal;
    }

    public double getConsultaTotal() {
        return consultaTotal;
    }

    public void setConsultaTotal(double consultaTotal) {
        this.consultaTotal = (int) consultaTotal;
    }

    public void total(){
        System.out.println("Total da Consulta: " + consultaTotal);
    }

}
