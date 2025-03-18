package com.senai.aula04_heranca.exercicios.sistema_de_gestao_de_pedidos;

public class Pedido {
    private int idPedido;
    private double valorTotal;

    public Pedido(int idPedido, double valorTotal) {
        this.idPedido = idPedido;
        this.valorTotal = valorTotal;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public int setValorTotal() {
        this.valorTotal = valorTotal;
        return 0;
    }

    public void exibirInformacoes(){
        System.out.println("\nID: "+idPedido+"\nValor Total: "+valorTotal);
    }

}
