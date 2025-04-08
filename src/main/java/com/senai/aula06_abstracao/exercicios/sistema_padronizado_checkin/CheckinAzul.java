package com.senai.aula06_abstracao.exercicios.sistema_padronizado_checkin;

public class CheckinAzul implements CheckinPadrao{
    @Override
    public void realizarCheckin() {
        System.out.println("Checkin pela Azul realizado");
    }

    @Override
    public void validarDocumentos() {
        System.out.println("Documento validado pela Azul");
    }

    @Override
    public void emitirCartaoEmbarque() {
        System.out.println("Cartao emitido pela Azul");
    }
}
