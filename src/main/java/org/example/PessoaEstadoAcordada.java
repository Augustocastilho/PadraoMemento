package org.example;

public class PessoaEstadoAcordada implements PessoaEstado {

    private PessoaEstadoAcordada() {};

    private static PessoaEstadoAcordada instance = new PessoaEstadoAcordada();

    public static PessoaEstadoAcordada getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Acordada";
    }

}
