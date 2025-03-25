package com.senai.aula05_polimorfismo.exemplos.sistema_de_pagamento;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pagamentos> listaPagamentos = new ArrayList<>();

        listaPagamentos.add(new CLT("vlad",1000));
        listaPagamentos.add(new PJ("Miguel", 24,1000));
        listaPagamentos.add(new Freelance("lis",100000));

        listaPagamentos.forEach(pagamentos -> System.out.printf("%s recebe R$%,.2f\n", pagamentos.getNome(), pagamentos.calcularPagamento()));

    }
}
