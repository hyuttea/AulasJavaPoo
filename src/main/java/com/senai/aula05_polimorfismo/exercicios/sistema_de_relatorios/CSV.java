package com.senai.aula05_polimorfismo.exercicios.sistema_de_relatorios;

public class CSV extends Relatorio{
    @Override
    public void gerarRelatorio() {
        System.out.println("Relatório gerado em CSV");
    }
}
