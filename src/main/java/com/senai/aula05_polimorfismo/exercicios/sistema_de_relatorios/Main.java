package com.senai.aula05_polimorfismo.exercicios.sistema_de_relatorios;

import com.senai.aula05_polimorfismo.exemplos.gestao_de_veiculos.Veiculo;
public class Main {
    public static void main(String[] args) {
        GerarRelatorio(new CSV());
        GerarRelatorio(new PDF());
        GerarRelatorio(new JSON());

    }
    private static void GerarRelatorio(Relatorio relatorio) {
        relatorio.gerarRelatorio();
    }
}
