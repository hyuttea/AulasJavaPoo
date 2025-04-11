package com.senai.aula04_heranca.exercicios.sistema_de_atendiento_medico;

public class Main {
    public static void main(String[] args) {
    PacienteConvenio pacienteConvenio = new PacienteConvenio("Jorge", 30,50,200);
    PacienteParticular pacienteParticular = new PacienteParticular("Laura ",19,300);

pacienteConvenio.exbibirInfos();
pacienteConvenio.descontoConvenio();

pacienteParticular.exbibirInfos();
pacienteParticular.total();

    }
}
