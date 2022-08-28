package edu.br.femass.model;

public enum TipoLancamento {
    DEBITO("Débito"),
    CREDITO("Crédito");

    String valor;

    TipoLancamento(String valor){
        this.valor = valor;
    }
}
