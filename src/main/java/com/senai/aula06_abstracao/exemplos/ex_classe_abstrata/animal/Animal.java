package com.senai.aula06_abstracao.exemplos.ex_classe_abstrata.animal;

public abstract class Animal {
    protected String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    void dormir(){
        System.out.println(nome + " está dormindo! ");
    }

    //abstrato se poe ponto e virgula no final

    abstract void fazerSom();
    }
