package com.senai.aula06_abstracao.exercicios.sistema_padronizado_checkin;

public class Main {
    public static void main(String[] args) {
    CheckinPadrao.boasVindas();
    testarCheckin(new CheckinAzul());
    testarCheckin(new CheckinGol());

    }
    private static void testarCheckin(CheckinPadrao checkinPadrao){
        checkinPadrao.realizarCheckin();
        checkinPadrao.validarDocumentos();
        checkinPadrao.validarBagagem(30);
        checkinPadrao.emitirCartaoEmbarque();

    }
}
