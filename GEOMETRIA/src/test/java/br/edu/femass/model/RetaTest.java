package br.edu.femass.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RetaTest {

    @Test
    void getTamanho() {
        Reta r1 = new Reta(0.0,0.0,0.0,5.0);
        Double esperado = 5.0;
        Assertions.assertEquals(esperado, r1.getTamanho());
    }

    @Test
    void testEquals() {
        Reta r1 = new Reta(0.0,0.0,0.0,5.0);
        Reta r2 = new Reta(0.0,0.0,0.0,5.0);
        Assertions.assertTrue(r1.equals(r2));
    }
}