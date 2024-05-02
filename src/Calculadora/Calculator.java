package Calculadora;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int dividend, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida!");
        }
        return dividend / divisor;
    }
}
