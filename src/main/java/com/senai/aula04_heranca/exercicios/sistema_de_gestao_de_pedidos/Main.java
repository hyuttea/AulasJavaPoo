package com.senai.aula04_heranca.exercicios.sistema_de_gestao_de_pedidos;

public class Main {
    public static void main(String[] args) {
    Pedido pedido = new Pedido(01,24.50);
    PedidoOnline pedidoOnline = new PedidoOnline(02,50,7);
    PedidoPresencial pedidoPresencial = new PedidoPresencial(03,70,10);

        PedidoPresencial pedidoPresencial1 = new PedidoPresencial(03, 1000.0, pedidoPresencial.getDescontoDebito());

        double valorComDesconto = pedidoPresencial.CalculoValorDesconto();
        System.out.println("Valor com desconto: " + valorComDesconto);

        pedido.exibirInformacoes();
        pedidoOnline.exibirInformacoes();
        pedidoPresencial.exibirInformacoes();
    }
}
