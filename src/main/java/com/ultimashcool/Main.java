package com.ultimashcool;

import com.ultimashcool.pessoas.Estudante;
import com.ultimashcool.pessoas.Responsavel;

public class Main {
    public static void main(String[] args) {
        Estudante estudante = new Estudante("Amanda Paixao");

        estudante.consolidarNota(1,6.0);
        estudante.consolidarNota(2,9.0);
        estudante.consolidarNota(3,7.0);
        estudante.consolidarNota(4,8.0);


        System.out.println(estudante.relatorio());
        System.out.println(estudante.verSituacao(5));

        Responsavel responsavel = new Responsavel("Andre Lutz");
        responsavel.pagarMensalidade(1,true);
        responsavel.pagarMensalidade(2,true);
        responsavel.pagarMensalidade(3,false);
        responsavel.pagarMensalidade(4,true);
        responsavel.pagarMensalidade(5,false);
        System.out.println(responsavel.relatorio());
        System.out.println(responsavel.verSituacao(1));
        System.out.println(responsavel.verSituacao(3));
    }
}