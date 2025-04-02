package com.senai.aula06_abstracao.exemplos.ex_interface.smartwatch;

public class Main {
    public static void main(String[] args) {
        SmartWatchAvancado smartWatchAvancado = new SmartWatchAvancado();

        smartWatchAvancado.contarPassos();
        smartWatchAvancado.medirFquenciaCardiaca();
        smartWatchAvancado.medirQualidadeSono();
        smartWatchAvancado.exibirInfoDespositivos();
    }
}
