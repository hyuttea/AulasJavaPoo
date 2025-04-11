package com.senai.aula04_heranca.exercicios.sistema_de_bibliotecas;

public class LivroDigital extends Livro{
    private double tamanhoArquivo;

    public LivroDigital(String titulo, String autor, double tamanhoArquivo) {
        super(titulo, autor);
        this.tamanhoArquivo = tamanhoArquivo;
    }

    public void tamanhoArquivo(){
        System.out.println("Tamanho do arquivo: " + tamanhoArquivo);
    }
}

