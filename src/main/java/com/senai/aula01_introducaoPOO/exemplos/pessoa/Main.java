package com.senai.aula01_introducaoPOO.exemplos.pessoa;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Rafa",19);

        Pessoa pessoa2 = new Pessoa (
                "juliano",
                48,
                1.70f,
                new Endereco(
                        "Guaca",
                        66,
                        "lauzane",
                        "Sao Paulo",
                        "SP"

                )
        );
        System.out.println(pessoa1);
        System.out.println(pessoa2);

        pessoa1.comer("cenoura");
        pessoa2.comer("bacon");
    }
}
