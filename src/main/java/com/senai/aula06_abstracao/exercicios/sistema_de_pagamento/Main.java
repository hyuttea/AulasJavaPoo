package com.senai.aula06_abstracao.exercicios.sistema_de_pagamento;

import com.senai.aula06_abstracao.exercicios.controle_de_entrega.Veiculos;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Pagamento> listaDePagamentos = new ArrayList<>();

        listaDePagamentos.add(new PIX());
        listaDePagamentos.add(new CarteirasDigitais());
        listaDePagamentos.add(new CartaoDeCredito());

        listaDePagamentos.forEach(Pagamento -> {
        Pagamento.autenticar();
        Pagamento.validar();
        Pagamento.registra();
        });
    }
}