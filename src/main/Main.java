package src.main;

public class Calculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Tidak dapat membagi dengan nol");
        }
        return a / b;
    }
    }
}
