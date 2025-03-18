package com.senai.aula04_heranca.exercicios.controle_de_estoque;

public class Eletronico extends Produto {
    private int voltagem;

    public Eletronico(String nome, double preco, int quantidade, int voltagem) {
        super(nome, preco, quantidade);
        this.voltagem = voltagem;
    }

    public int getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("\nnome: "+ getNome() +"\npreço: " + getPreco()+"\nquantidade estoque: "+getQuatidade()+ "\nData de Validade: " +"\nVoltagem: "+voltagem);
    }
}

