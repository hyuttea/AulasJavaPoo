package com.senai.aula04_heranca.exemplos.veiculo;

public class Carro extends Veiculo {
    private int portas;

    public Carro(String modelo, int ano, int portas) {
        super(modelo, ano);
        this.portas = portas;
    }

    public void exibirDetalhes(){
        super.exibirDetalhes();
        System.out.println(", Portas: "+portas);
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }
}
