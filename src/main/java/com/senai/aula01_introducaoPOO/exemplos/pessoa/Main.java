package com.senai.aula01_introducaoPOO.exemplos.pessoa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Rafa",19);
        Scanner scanner = new Scanner(System.in);
        String cabecalho[] = {"Nome: ", "Idade: ","Altura: ","Endereço \n\tRua: ","\tNúmero: ","\tBairro: ","\tCidade: ","\tEstado: "};
        //posiçoes do cabeçalho
        String[] dados = new String[8];

        //mostrou para o usuario cada item
        System.out.println("Preencha as informaçoes a seguir");
        for (int i = 0; i <cabecalho.length ; i++) {
            System.out.print(cabecalho[i]);
            dados[i] = scanner.nextLine();
        }
        //preenche com os dados
        Pessoa pessoa2 = new Pessoa(
                dados[0],
                Integer.parseInt(dados[1]), //converte string para Int
                Float.parseFloat(dados[2]), //converte string para Float
                new Endereco(
                        dados[3],
                        Integer.parseInt(dados[4]), //converte string para Int
                        dados[5],
                        dados[6],
                        dados[7]
                )
        );
        System.out.println(pessoa1);
        System.out.println(pessoa2);

        pessoa1.comer("cenoura");
        pessoa2.comer("bacon");
    }
}
