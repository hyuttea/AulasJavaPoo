package com.senai.aula01_introducaoPOO.exemplos.concessionaria;

public class Carro {
    String modelo;
    String fabricante;
    String cor;
    int ano;
    double valorInicial;

    public Carro(String modelo, String fabricante, String cor, int ano, double valor) {
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.cor = cor;
        this.ano = ano;
        this.valorInicial = valor;
    }
    public void valorFip(int anoAtual){
        double valorFinal = valorInicial;
        int idade = anoAtual - ano;

        for (int i = 0; i < idade; i++) {
            valorFinal -= (valorFinal*0.02);

        }
        System.out.println("Valor atual do veiculo "+ modelo + " com desvalorização de 2% ao ano será de R$"+String.format("%.2f",valorFinal)); //%f formata o numero, nao deixa tao grande
    }
    public void testeDrive(){ //sem retorno
        System.out.println("Vroommm!" + modelo + "ligado.");
    }
    public void comprar(String nomeCliente){ //sem retorno
        System.out.println("Parabéns" + nomeCliente + ", voce comprou o " + modelo);
    }
}
