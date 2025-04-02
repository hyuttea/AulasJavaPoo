package com.senai.aula06_abstracao.exemplos.ex_interface.smartwatch;

public class SmartWatchAvancado implements SensorCardiaco, SensorPassos, SensorSono{
    @Override
    public void medirFquenciaCardiaca() {
        System.out.println("Medução Cardiaca : 80bpm");
    }

    @Override
    public void contarPassos() {
        System.out.println("Passos Hoje : 3 passos");
    }

    @Override
    public void medirQualidadeSono() {
        System.out.println("Qualidade de Sono : 7h30 em sono profundo");
    }
    void exibirInfoDespositivos(){
        System.out.println("Dispositivos Conectados: ...");
    }
}
