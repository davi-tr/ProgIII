package br.edu.femass.model;

public class Fornecedor {

    private String nome;
    private String cpnj;

    public String getCpnj(){
        return cpnj;
    }

    public String getNome() {
        return nome;
    }

    public void setCpnj(String cpnj) {
        this.cpnj = cpnj;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
