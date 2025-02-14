package com.senai.aula02_colecoes.exemplos.pessoas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Guilherme", 19);
        Pessoa pessoa2 = new Pessoa("Marcelo", 19);
        Pessoa pessoa3 = new Pessoa("Laura", 19);

        Pessoa[] matrizPessoas = new Pessoa[4];

        matrizPessoas[0] = pessoa1;
        matrizPessoas[1] = pessoa2;
        matrizPessoas[2] = pessoa3;

        for (Pessoa pessoa : matrizPessoas) {
            System.out.println(pessoa);

        }
        matrizPessoas[0].falar("AAAAAAAAAA");
        matrizPessoas[3] = new Pessoa("Oto", 22);
        System.out.println(matrizPessoas[3].nome);

        //possível, mas não viável
        ArrayList lista = new ArrayList();

        lista.add(12);
        lista.add(true);
        lista.add("Teste");
        lista.add(pessoa1);

        Pessoa pessoa = (Pessoa) lista.get(3);

        pessoa.falar("teste");

        ArrayList<Pessoa> listaPessoas = new ArrayList<>();

        listaPessoas.add(pessoa1); // variável já criada
        listaPessoas.add(new Pessoa("Joseph", 40)); //constrói direto na lista

        System.out.printf("Tamanho da lista: " + listaPessoas.size());
        listar(listaPessoas);
        listaPessoas.remove(pessoa1);
        listar(listaPessoas);

        listaPessoas.set(0, pessoa2);
        listar(listaPessoas);

        listaPessoas.add(0, pessoa3);
        listar(listaPessoas);

        listaPessoas.forEach(System.out::println); // Vai na lista de pessoas e pegar cada pessoa e passar o println || :: - Mostra todos os metodos

        List<Pessoa> listaFiltrada = listaPessoas.stream().filter(p -> pessoa.idade>=10).toList();//para cada objeo ele retorna cada stream e retornar | Existe varias ferramentas a usada é o filter(filtro)
        System.out.println("-----teste filtro-----");

        listaFiltrada.forEach(System.out::println);

        Scanner scanner = new Scanner(System.in);
        System.out.println("preencha as informaçoes a seguir:");
        System.out.println("Nome: ");
        String nome = scanner.nextLine();
        int idade = scanner.nextInt();
        listaPessoas.add(new Pessoa(nome,idade));



    }
    public static void listar (ArrayList<Pessoa> lista){
        System.out.println("");
        for (Pessoa pessoa : lista){
            System.out.println(pessoa);
        }
    }
}
