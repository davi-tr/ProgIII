package br.edu.femass.model;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private String cpf;
    private String endereco;
    private List<Conta> contas;

    public Cliente(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.contas = new ArrayList<Conta>();
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return this.getNome();
    }
}
