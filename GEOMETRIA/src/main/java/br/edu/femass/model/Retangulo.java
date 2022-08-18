package br.edu.femass.model;

public class Retangulo extends Quad{
    private Reta altura;

    public Retangulo(Reta lado, Reta altura){
        super(lado);
        this.altura = altura;
    }

    public Reta getAltura(){
        return altura;
    }

    @Override
    public Double getArea(){
        return super.lado.getTamanho() *
                this.altura.getTamanho();
    }

    @Override
    public Double getPerimetro(){
        return super.lado.getTamanho()*2 +
                this.altura.getTamanho()*2;
    }
}
