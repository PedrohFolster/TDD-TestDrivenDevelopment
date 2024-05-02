package Calculadora;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculadoraTest {

    private Calculadora calculadora = new Calculadora();

    @Test
    void somar() {
        int resultado = calculadora.somar(1,2);
        Assertions.assertEquals(3,resultado);
    }

    @Test
    void subtrair(){
        int resultado = calculadora.subtrair(10, 2);
        Assertions.assertEquals(8, resultado);
    }

    @Test
    void dividir(){
        int resultado = calculadora.dividir(6, 2);
        Assertions.assertEquals(3,resultado);
    }
}