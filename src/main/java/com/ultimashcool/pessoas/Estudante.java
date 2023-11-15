package com.ultimashcool.pessoas;

public class Estudante extends Pessoa{

    private String matricula;

    private double[] notas = new double[4];

    public Estudante(String nome) {
        super(nome);
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public void consolidarNota (int unidade, double nota){
        //TODO implementar
    }
    public double calcularMediaF(){
        //TODO implementar
        return 0.0;
    }

    @Override
    public String verSituacao(int mes) {
        //TODO implementar
        return null;
    }

    @Override
    public String relatorio() {
        //TODO implementar
        return null;
    }
}
