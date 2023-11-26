package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PessoaTest {

    @Test
    void deveArmazenarEstados() {
        Pessoa pessoa = new Pessoa();
        pessoa.setEstado(PessoaEstadoAcordada.getInstance());
        pessoa.setEstado(PessoaEstadoSonolenta.getInstance());
        pessoa.setEstado(PessoaEstadoDormindo.getInstance());
        assertEquals(3, pessoa.getEstados().size());
    }

    @Test
    void deveRetornarEstadoInicial() {
        Pessoa pessoa = new Pessoa();
        pessoa.setEstado(PessoaEstadoAcordada.getInstance());
        pessoa.setEstado(PessoaEstadoSonolenta.getInstance());
        pessoa.restaurarEstado(0);
        assertEquals(PessoaEstadoAcordada.getInstance(), pessoa.getEstado());
    }

    @Test
    void deveRetornarEstadoAnterior() {
        Pessoa pessoa = new Pessoa();
        pessoa.setEstado(PessoaEstadoAcordada.getInstance());
        pessoa.setEstado(PessoaEstadoSonolenta.getInstance());
        pessoa.setEstado(PessoaEstadoDormindo.getInstance());
        pessoa.restaurarEstado(1);
        assertEquals(PessoaEstadoSonolenta.getInstance(), pessoa.getEstado());
    }
        
    @Test
    void deveRetornarExcecaoIndiceInvalido() {
        try {
            Pessoa pessoa = new Pessoa();
            pessoa.restaurarEstado(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Índice inválido", e.getMessage());
        }
    }

}