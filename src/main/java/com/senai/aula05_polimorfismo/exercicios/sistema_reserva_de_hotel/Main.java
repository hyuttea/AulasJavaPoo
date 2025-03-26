package com.senai.aula05_polimorfismo.exercicios.sistema_reserva_de_hotel;

public class Main {
    public static void main(String[] args) {
        Reserva reserva = new ReservaSimples("claudia",100,40,4,0,20);
        Reserva reserva1 = new ReservaVIP("Melissa",1000,100,7,0,500);

        System.out.println("Custo da reserva simples: R$"+ reserva.calcularReserva());
        System.out.println("Custo da reserva VIP: R$ "+ reserva1.calcularReserva());
    }
}
