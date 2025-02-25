package com.senai.aula03_encapsulamento.exemplos;

public class Carro {
    //Atributo privado: só pode ser acessado dntro da própria classe
    private int velocidade;

    //Construtor de classe
    public Carro() {
        velocidade = 0;
    }

    //Método público para obter a velocidade (getter)
    public int getVelocidade() {
        return velocidade;
    }

    //Método público para definir a velocidade (Setter)
    public void setVelocidade(int velocidade) {
        if (velocidade >= 0) {
            this.velocidade = velocidade;
        } else {
            System.out.println("Velocidade inválida!");
        }
    }
}
