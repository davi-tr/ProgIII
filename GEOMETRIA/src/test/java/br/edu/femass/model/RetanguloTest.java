package br.edu.femass.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RetanguloTest {

    @Test
    void getArea() {
        Retangulo ret = new Retangulo(
                new Reta(
                        0.0,
                        0.0,
                        0.0,
                        5.0
                ),
                new Reta(0.0,
                         0.0,
                         8.0,
                         0.0
                        )
        );
        Double esperado = 40.0;
        Assertions.assertEquals(esperado, ret.getArea());
    }

    @Test
    void getPerimetro() {
        Retangulo ret = new Retangulo(
                new Reta(
                        0.0,
                        0.0,
                        0.0,
                        5.0
                ),
                new Reta(0.0,
                        0.0,
                        8.0,
                        0.0
                )
        );
        Double esperado = 26.0;
        Assertions.assertEquals(esperado, ret.getPerimetro());
    }
}