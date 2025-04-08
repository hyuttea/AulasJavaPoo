package com.senai.aula06_abstracao.exercicios.sistema_padronizado_checkin;

public class CheckinGol implements CheckinPadrao{
    @Override
    public void realizarCheckin() {
        System.out.println("Checkin pela gol realizado");
    }

    @Override
    public void validarDocumentos() {
        System.out.println("Documento validado pela gol");
    }

    @Override
    public void emitirCartaoEmbarque() {
        System.out.println("Cartao emitido pela Gol");
    }
}
