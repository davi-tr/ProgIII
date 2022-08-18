package br.edu.femass.model;

public class Quad {
    protected Reta lado;

    public Quad(Reta lado){
        this.lado = lado;
    }

    public Reta getLado(){
        return lado;
    }

    public Double getArea(){
        return Math.pow(this.lado.getTamanho(),2);
    }

    public Double getPerimetro(){
        return this.lado.getTamanho()*4;
    }
}
