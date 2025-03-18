package com.senai.aula04_heranca.exercicios.controle_de_estoque;

import java.time.LocalDate;

 class Alimento extends Produto {
    private LocalDate dataValidade;

     public Alimento(String nome, double preco, int quatidade, LocalDate dataValidade) {
         super(nome, preco, quatidade);
         this.dataValidade = dataValidade;
     }

     public LocalDate getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(LocalDate dataValidade) {
        this.dataValidade = dataValidade;
    }

     @Override
     public void exibirInformacoes() {
         System.out.println("\nnome: "+ getNome() +"\npreço: " + getPreco()+"\nquantidade estoque: "+getQuatidade()+ "\nData de Validade: " +dataValidade);
     }
 }

