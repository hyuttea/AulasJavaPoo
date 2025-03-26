package com.senai.aula05_polimorfismo.exercicios.gestao_de_produtos;

import com.senai.aula05_polimorfismo.exemplos.sistema_de_pagamento.Pagamentos;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Produto> listaTotal = new ArrayList<>();
       listaTotal.add(new ProdutoFisico("Camera: ",2000,30));
       listaTotal.add(new ProdutoDigital("Torneira: ",50,90));
       listaTotal.add(new ProdutoServico("Relógio: ",1000,30));

        listaTotal.forEach(produto -> System.out.println(produto.getNome() + produto.calcularImposto()));
    }
}
