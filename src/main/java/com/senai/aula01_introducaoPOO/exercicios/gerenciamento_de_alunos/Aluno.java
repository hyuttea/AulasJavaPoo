package com.senai.aula01_introducaoPOO.exercicios.gerenciamento_de_alunos;

import java.util.Scanner;

public class Aluno {
    String nome;
    int idade;
    double nota;

    public Aluno(String nome, int idade, double nota) {
        this.nome = nome;
        this.idade = idade;
        this.nota = nota;
    }
    public void exibirInformacoes(){
        System.out.println("O aluno se chama "+nome+", tem "+idade+" anos de idade, sua nota foi "+nota);
    }
    public void atualizaNota(double notaRecebida){
       Scanner input = new Scanner(System.in);

    }
    public void verificaAprovacao(){
        if (nota >= 6.0 ) {
            System.out.println("\tParabéns! você foi aprovado");
        }else {
            System.out.println("\tVocê foi reprovado :(");

        }
    }
}
