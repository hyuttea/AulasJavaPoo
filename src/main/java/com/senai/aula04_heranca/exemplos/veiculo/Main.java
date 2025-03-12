package com.senai.aula04_heranca.exemplos.veiculo;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("City",2013,4);
        Moto moto = new Moto("Titan",2024, true);

        carro.exibirDetalhes();
        moto.exibirDetalhes();
    }
}
