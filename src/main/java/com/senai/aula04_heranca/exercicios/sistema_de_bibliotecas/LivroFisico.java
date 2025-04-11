package com.senai.aula04_heranca.exercicios.sistema_de_bibliotecas;

public class LivroFisico extends Livro{
    private int numeroPaginas;

    public LivroFisico(String titulo, String autor, int numeroPaginas) {
        super(titulo, autor);
        this.numeroPaginas = numeroPaginas;
    }

    public void numeroPaginas(){
        System.out.println("Numero de páginas: " + numeroPaginas);
    }
}
