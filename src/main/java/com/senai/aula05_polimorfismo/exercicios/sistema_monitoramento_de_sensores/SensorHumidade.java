package com.senai.aula05_polimorfismo.exercicios.sistema_monitoramento_de_sensores;

public class SensorHumidade extends Sensor{
    private double humidade;

    public SensorHumidade(double medida, double grausC) {
        super(medida);
        this.humidade = grausC;
    }

}
