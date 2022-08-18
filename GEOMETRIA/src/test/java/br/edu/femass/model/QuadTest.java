package br.edu.femass.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuadTest {

    @Test
    void getArea() {
        Quad q = new Quad(
                new Reta(
                        0.0,
                        0.0,
                        0.0,
                        3.0
                )
        );

        Double esperado = 9.0;
        Assertions.assertEquals(esperado, q.getArea());
    }

    @Test
    void getPerimetro() {
        Quad q = new Quad(
                new Reta(
                        0.0,
                        5.0,
                        5.0,
                        5.0
                )
        );

        Double esperado = 20.0;
        Assertions.assertEquals(esperado, q.getPerimetro());
    }
}