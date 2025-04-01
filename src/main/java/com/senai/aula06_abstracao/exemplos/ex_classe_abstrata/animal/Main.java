package com.senai.aula06_abstracao.exemplos.ex_classe_abstrata.animal;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> listaDeAnimal = new ArrayList<>();

        listaDeAnimal.add(new Cachorro("Rex"));
        listaDeAnimal.add(new Gato("Tom"));

        listaDeAnimal.forEach(animal -> {
            animal.dormir();
            animal.fazerSom();
        });
    }
}
