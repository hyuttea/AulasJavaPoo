package com.senai.aula06_abstracao.exercicios.sistema_padronizado_checkin;

public interface CheckinPadrao {
    int PESO_BAGAGEM_MAX = 40;
    void realizarCheckin();
    void validarDocumentos();
    void emitirCartaoEmbarque();
    default void validarBagagem(int pesoBagagem){

        if (pesoBagagem <= PESO_BAGAGEM_MAX){
            System.out.println("Bagagem autorizada");
        }else{
            System.out.println("Bagagem rejeitada");
        }
    }
    static void boasVindas(){
        System.out.println("Seja bem vindo a FlySecure\n");
    }
}
