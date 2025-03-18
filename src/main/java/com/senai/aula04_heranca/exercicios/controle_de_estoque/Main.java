package com.senai.aula04_heranca.exercicios.controle_de_estoque;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
    Alimento alimento = new Alimento("Arroz", 30.00,3000, LocalDate.of(2026,5,30));
    Eletronico eletronico = new Eletronico("Geladeira",26000,40000,110);

    alimento.exibirInformacoes();
    eletronico.exibirInformacoes();
    }
}
