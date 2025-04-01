package com.senai.aula06_abstracao.exemplos.ex_classe_abstrata.animal;

public class Cachorro extends Animal{

    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    void fazerSom() {
        System.out.println(nome + " está Latindo: Au Au");

    }
}
