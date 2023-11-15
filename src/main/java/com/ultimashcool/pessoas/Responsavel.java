package com.ultimashcool.pessoas;

import java.util.ArrayList;

public class Responsavel extends Pessoa {

    final int MESES = 12;
    private boolean[] pagamentos = new boolean[MESES];

    public Responsavel(String nome) {
        super(nome);
    }

    public boolean[] getPagamentos() {
        return pagamentos;
    }

    public void setPagamentos(boolean[] pagamentos) {

        this.pagamentos = pagamentos;
    }

    public boolean pagarMensalidade(int mes, boolean situacao) {
        pagamentos[mes] = situacao;
        return situacao;
    }

    @Override
    public String verSituacao(int mes) {
        if (getPagamentos()[mes]) {
            return "O pagamento foi realizado no mes: " + mes;
        } else {
            return "O pagamento nao foi realizado no mes: " + mes;
        }
    }

    private String ConverteListaEmStr(ArrayList<Integer> lista){
        String resultado = "";
        for (int Listas : lista){
            resultado += Listas + " , ";
        }
        return resultado;
    }

    private String mesesPagos(){
        ArrayList<Integer> listaMesesPagos = new ArrayList<Integer>();

        for(int mes = 1; mes < pagamentos.length; mes++){
            if (pagamentos[mes]){
                listaMesesPagos.add(mes);
            }
        }
        return ConverteListaEmStr(listaMesesPagos);
    }

    @Override
    public String relatorio() {

        return "\nO(A) responsavel financeiro " + getNome() + ", " + "realizou o pagamento nos meses: " + mesesPagos();
    }
}
