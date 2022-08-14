package br.edu.femass.model;

public class Reta {
    private Ponto p1;
    private Ponto p2;

    public Reta(Ponto 1, Ponto 2){
        this.p1 = p1;
        this.p2 = p2;
    }

    public Reta(Double x1, Double y1, Double x2, Double y2){
        this.p1 = new Ponto(x1, y1);
        this.p2 = new Ponto(x2, y2);
    }

    public  Ponto getP1(){
        return p1;
    }

    public  Ponto getP2(){
        return p2;
    }

    public Double getTamanho(){
        return this.getP1().getDistancia(this.getP2());
    }

    public String toString(){
        return this.getP1().toString() + ", " + this.getP2().toString();
    }

    public boolean equals (Object object){
        Reta s = (Reta) object;

        if (s.getP1().equals(this.getP1()) && s.getP2().equals(this.getP2())) return true;
        if (s.getP1().equals(this.getP2()) && s.getP2().equals(this.getP1())) return true;

        return false;
    }
}
