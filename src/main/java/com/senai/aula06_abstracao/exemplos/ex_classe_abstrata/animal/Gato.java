package com.senai.aula06_abstracao.exemplos.ex_classe_abstrata.animal;

public class Gato extends Animal{
    public Gato(String nome) {
        super(nome);
    }

    @Override
    void fazerSom() {
        System.out.println(nome + " está Miando: Miau");

    }
}
