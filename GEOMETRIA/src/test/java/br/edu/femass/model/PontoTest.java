package br.edu.femass.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PontoTest {

    @Test
    void getX() {
        Ponto p = new Ponto(3.2,0.2);
        Double esperado = 3.2;
        Assertions.assertEquals(esperado, p.getX());
    }

    @Test
    void getY() {
        Ponto p = new Ponto(3.2,0.2);
        Double esperado = 0.2;
        Assertions.assertEquals(esperado, p.getY());
    }

    @Test
    void getlocalizacao() {
        Ponto p = new Ponto(3.2,0.2);
        String esperado = "1o Quadrante";
        Assertions.assertEquals(esperado, p.getlocalizacao());
    }

    @Test
    void getDistancia() {
        Ponto p = new Ponto();
        Ponto p2 = new Ponto(0.0,10.0);
        Double esperado = 10.0;
        Assertions.assertEquals(esperado, p.getDistancia(p2));
    }

    @Test
    void testToString() {
        Ponto p = new Ponto(3.2,0.2);
        String esperado = "(3.2, 0.2)";
        Assertions.assertEquals(esperado, p.toString());
    }

    @Test
    void testEquals() {
        Ponto p = new Ponto(10.0, 2.0);
        Ponto p2 = new Ponto(10.0, 2.0);
        Assertions.assertTrue(p.equals(p2));
    }
}