package src.main;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int result1 = calculator.add(2, 3);
        System.out.println("3 + 3 = " + result1); // Output: 2 + 3 = 5

        int result2 = calculator.subtract(5, 2);
        System.out.println("5 - 2 = " + result2); // Output: 5 - 2 = 3

        int result3 = calculator.multiply(4, 3);
        System.out.println("4 * 3 = " + result3); // Output: 4 * 3 = 12

        int result4 = calculator.divide(10, 2);
        System.out.println("10 / 2 = " + result4); // Output: 10 / 2 = 5
    }
}
