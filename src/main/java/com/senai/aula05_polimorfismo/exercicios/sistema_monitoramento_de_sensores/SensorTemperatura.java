package com.senai.aula05_polimorfismo.exercicios.sistema_monitoramento_de_sensores;

public class SensorTemperatura extends Sensor{
    private double grausC;

    public SensorTemperatura(double medida, double grausC) {
        super(medida);
        this.grausC = grausC;
    }

}
