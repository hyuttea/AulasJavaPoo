package com.senai.aula04_heranca.exercicios.sistema_de_gestao_de_pedidos;

public class PedidoOnline extends Pedido{
    private double taxaEntrega;

    public PedidoOnline(int idPedido, double valorTotal, int taxaEntrega) {
        super(idPedido, valorTotal);
        this.taxaEntrega = taxaEntrega;
    }

    public double getTaxaEntrega() {
        return taxaEntrega;
    }

    public void setTaxaEntrega(int taxaEntrega) {
        this.taxaEntrega = taxaEntrega;
    }

    public int calculoTaxa() {
        double taxa = getValorTotal() + taxaEntrega;
        return setValorTotal();

    }

    public void exibirInformacoes(){
        System.out.println("\n ---pedido online----"+"\nID: "+getIdPedido()+"\nValor Total: "+getValorTotal()+"\nTaxa de Entrega: "+taxaEntrega);
    }


}
