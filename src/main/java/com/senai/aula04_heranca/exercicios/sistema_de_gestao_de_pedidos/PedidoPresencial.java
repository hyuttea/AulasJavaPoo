package com.senai.aula04_heranca.exercicios.sistema_de_gestao_de_pedidos;

public class PedidoPresencial extends Pedido{
    private int descontoDebito;

    public PedidoPresencial(int idPedido, double valorTotal, int descontoDebito) {
        super(idPedido, valorTotal);
        this.descontoDebito = descontoDebito;
    }

    public int getDescontoDebito() {
        return descontoDebito;
    }

    public void setDescontoDebito(int descontoDebito) {
        this.descontoDebito = descontoDebito;
    }

    public double CalculoValorDesconto() {
        double valorComDesconto = getValorTotal() - (getValorTotal() * (descontoDebito / 100.0));
        return valorComDesconto;
    }

    public void exibirInformacoes(){
        System.out.println("\n -----pedido presencial-----"+"\nID: "+getIdPedido()+"\nValor Total: "+getValorTotal()+"\nDesconto de pagamento à Vista: "+ descontoDebito);
    }
}
