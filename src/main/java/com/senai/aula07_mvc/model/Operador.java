package com.senai.aula07_mvc.model;

    public class Operador extends Usuario{
        private String setor;

        public Operador(String nome, int id, String setor) {
            super(nome, id);
            this.setor = setor;
        }
    }
