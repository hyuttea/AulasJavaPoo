package com.senai.aula04_heranca.exercicios.sistema_de_atendiento_medico;

public class PacienteConvenio extends Paciente {
    private double desconto;
    private double total;

    public PacienteConvenio(String nome, int idade, double desconto, double total) {
        super(nome, idade);
        this.desconto = desconto;
        this.total = total;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Desconto por Convênio: R$ " + (total - desconto);
    }

    public void descontoConvenio() {
        System.out.println("Desconto por Convênio: R$ " + (total - desconto));
    }
}
