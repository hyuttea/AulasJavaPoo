package com.senai.aula05_polimorfismo.exercicios.sistema_monitoramento_de_sensores;

public class Sensor {
    private double medida;

    public Sensor(double medida) {
        this.medida = medida;
    }

    public double getMedida() {
        return medida;
    }

    public void setMedida(double medida) {
        this.medida = medida;
    }
}
