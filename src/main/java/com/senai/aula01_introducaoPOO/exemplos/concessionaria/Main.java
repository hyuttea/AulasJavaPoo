package com.senai.aula01_introducaoPOO.exemplos.concessionaria;

public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro(
                "City",
                "Honda",
                "preto",
                2012,
                60000
        );

        Carro carro2 = new Carro(
                "Fiesta",
                "Ford",
                "Preto",
                2012,
                10000
        );
        System.out.println();
        System.out.println();

        carro1.testeDrive();
        carro1.comprar("Raf");
        carro2.testeDrive();
        carro2.comprar("Gi");

        carro1.valorFip(2025);
        carro2.valorFip(2025);
    }
}
