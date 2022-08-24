package edu.br.femass.model;

import java.util.ArrayList;
import java.util.List;

public class Conta {
    private Long numero;
    private Double saldo;
    private Double especial;
    private List<Historico> historico;

    private static Long proximonumero = 1L;

    public Conta(Double especial){
        this.numero = proximonumero;
        proximonumero++;
        this.saldo = 0D;
        this.especial = especial;
        this.historico = new ArrayList<Historico>();
    }

    public Double getEspecial() {
        return especial;
    }

    public Long getNumero() {
        return numero;
    }

    public Double getSaldo() {
        return saldo;
    }

    public List<Historico> getHistorico() {
        return historico;
    }

    public void setEspecial(Double especial) {
        this.especial = especial;
    }
}

