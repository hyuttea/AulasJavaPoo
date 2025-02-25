package com.senai.aula03_encapsulamento.exemplos;

public class Main {
    public static void main(String[] args) {
        //Criando um obseto da classe Carro
        Carro meuCarro = new Carro();

        //ultilizando métodos públicos paa modificar e acessar a variável privada
        meuCarro.setVelocidade(100); //Define a velocidade para 100
        System.out.println("Velocidade atual: " + meuCarro.getVelocidade());

        //testando uma velocidade inválida
        meuCarro.setVelocidade(-20); //isso mostrara uma mensagem de erro
        /*meuCarro.velocidade = -20; // agora funciona sem erro
        System.out.println("Velocidade modificada diretamente: " = meuCarro.velocidade);*/
    }
}