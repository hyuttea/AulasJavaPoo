package com.senai.aula05_polimorfismo.exercicios.sistema_reserva_de_hotel;

public class ReservaSimples extends Reserva{
    public int taxaServico;

    public ReservaSimples(String nomeCliente, double diaria, double alimentacao, int qtdDias, double valorTotal, int taxaServico) {
        super(nomeCliente, diaria, alimentacao, qtdDias, valorTotal);
        this.taxaServico = taxaServico;
    }

    @Override
    public double calcularReserva() {
        return super.calcularReserva()+taxaServico;
    }
}
