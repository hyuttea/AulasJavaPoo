package com.senai.aula04_heranca.exemplos;

public class Veiculo {
        String modelo;
        int ano;

    public Veiculo(String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
    }

    public int getAno() {
            return ano;
        }

        public void setAno(int ano) {
            this.ano = ano;
        }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void exibirDetalhes(){
            System.out.print("Marca: " +modelo+ ", Ano "+ ano);
        }
    }

