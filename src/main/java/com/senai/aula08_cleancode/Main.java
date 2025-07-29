package com.senai.aula08_cleancode;

import com.senai.aula07_mvc.crud_usuario.model.Usuario;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
}
//1. sem clean code
public void processar(int[] numeros) {
    int soma = 0;
    int maior = Integer.MIN_VALUE;

    for(int n : numeros){
        soma += n;
        if(n > maior){
            maior = n;
        }
    }
    System.out.println("Soma:" + soma);
    System.out.println("Maior numero:" + maior);
}

//1. clean
public void processar(int[] numeros) {
    int soma= calcularSoma(numeros);
    int maior = encontrarMaior(numeros);

    exibirResultados(soma, maior);
}
private int calcularSoma(int[] numeros){
    int soma =0;
    for(int n : numeros) {
    soma += n;
    }
    return soma;
}

private int encontrarMaior(int[] numeros){
    int maior = Integer.MIN_VALUE;
    for (int n : numeros){
        if (n > maior){
            maior = n;
        }
    }
        return maior;
}
private void exibirResultados(int soma, int maior){
    System.out.println("Soma" + soma);
    System.out.println("Maior numero:" + maior);
}

//2. sem clean code
public void p(int[] a){
    int x = 0;
    for(int 1 : a){
        x += i;
    }
    System.out.println(x);
}

//2. clean
public oif imprimirSoma (int[] numeros){
    int somaTotal = calcularSoma(numeros);
    System.out.println("Soma Total: " + somaTotal);
}
private int calcularSoma(int[] numeros){
    int soma = 0;
    for(int numero : numeros){
        soma += numero;
    }
    return soma;
}
//3. sem clean code
public boolean verificarPermissao(Usuario usuario){
    if (usuario !=null){
        if(usuario.isAtivo()){
            if(usuario.getPerfil(.equals("ADMIN")){
                return true;
            }
        }
    }
    return false;
}
//3. clean
public boolean verificarPermissao(Usuario usuario){
    if (usuario == null || !usuario.isAtivo()) {
        return false
    }
    return  usuario.getPerfil().equals("ADMIN");
}
//4. sem
public void processarArquivo(String caminho){
    try{
        FileReader = new FileReader(caminho);
        //logica para proessar o arquivo
    } catch (Exeption e){
        System.out.println("Erro ao processar o arquivo.");
    }
}
//4.clean
public void processarArquivo(String caminho){
    try {
        FileReader leitor = new FileReader(caminho);
        //logica para procesar o arquivo
    }catch (FileNotFoundException e){
        System.out.println("Arquivo nao envcontrado: " + caminho);
    }catch (IOException e){
        System.out.println("Erro ao ler o arquivo: " + caminho);
    }
}
//5. sem
public class Relatorio{
    public void gerarRelatorio(){
        //logica para gerar os dados do relatorio
        System.out.println("Relatorio gerado.");
    }
    public void salvaRelatorio(String caminho){
        //logica para salvar o relatorio no disco
        System.out.println("relatorio salvo em: " + caminho);
    }
    public void enviarRelatorioPorEmail(String email){
        //Logica para enviar o relatorio por email
        System.out.println("Relatorio enviado para: " + email);
    }
}
//5. clean
public class Relatorio{
    public void gerarRelatorio(){
        //logica para gerar os dados do relatorio
        System.out.println("Relatorio gerado.");
    }
}
public class RelatorioPersistencia{
    public void salvarRelatorio(String caminho){
        //logica para salvar o relatorio no disco
        System.out.println("Relatorio salvo em: " + caminho);
    }
}
public void enviarRelatorioPorEmail(String email){
    //Logica para enviar o relatorio por email
    System.out.println("Relatorio enviado para: " + email);
}
//6. sem
Public void calcularSalarioMensal(){
    double salarioBase = 3000.0;
    double bonus = 500.0;
    double salarioTotal = salarioBase + bonus;
    System.out.println("SAlario Mensal: " + salarioTotal);
}
public void calcularSalarioAnual(){
    double salarioBase = 3000.0;
    double bonus = 500.0;
    double salarioMensal = salarioBase + bonus;
    double salarioAnual = salarioMensal*12;
    System.out.println("Salario Anual" + salarioAnual);
}
//6.clean
public double calcularSlarioMensal(){
    double salarioBase = 3000.0;
    double bonus = 500.0;
    return salarioBase + bonus;
}
public void exibirSalarioMensal(){
    System.out.println("Salario Mensal: " + calcularSlarioMensal());
}
public void exibirSalarioAnual(){
    double salarioAnual = calcularSlarioMensal()*12;
    System.out.println("Salario Anual: " + salarioAnual);
}