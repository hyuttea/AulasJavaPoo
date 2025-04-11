package com.senai.aula04_heranca.exercicios.sistema_de_bibliotecas;

public class Main {
    public static void main(String[] args) {
        LivroFisico livroFisico = new LivroFisico("Beyond |","Lucio Fulci ",300);
        LivroDigital livroDigital = new LivroDigital("yyy |","xxx ",20.8);

        livroDigital.exibirInfo();
        livroDigital.tamanhoArquivo();

        livroFisico.exibirInfo();
        livroFisico.numeroPaginas();
    }
}
