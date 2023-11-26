package org.example;

public class PessoaEstadoSonolenta implements PessoaEstado {

    private PessoaEstadoSonolenta() {};

    private static PessoaEstadoSonolenta instance = new PessoaEstadoSonolenta();

    public static PessoaEstadoSonolenta getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Sonolenta";
    }

}
