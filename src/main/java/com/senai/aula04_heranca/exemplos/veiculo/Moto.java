package com.senai.aula04_heranca.exemplos.veiculo;

public class Moto extends Veiculo {
    private boolean partidaEletrica;

    public Moto(String modelo, int ano, boolean partidaEletrica) {
        super(modelo, ano);
        this.partidaEletrica = partidaEletrica;
    }

    public boolean isPartidaEletrica() {
        return partidaEletrica;
    }

    public void setPartidaEletrica(boolean partidaEletrica) {
        this.partidaEletrica = partidaEletrica;
    }
    public void exibirDetalhes(){
        super.exibirDetalhes();
        System.out.println(", Partida Eletrica: "+(partidaEletrica ? "Sim" : "Não"));
    }
}
