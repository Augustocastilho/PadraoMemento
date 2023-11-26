package org.example;

public class PessoaEstadoDormindo implements PessoaEstado {

    private PessoaEstadoDormindo() {};

    private static PessoaEstadoDormindo instance = new PessoaEstadoDormindo();

    public static PessoaEstadoDormindo getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Dormindo";
    }

}
