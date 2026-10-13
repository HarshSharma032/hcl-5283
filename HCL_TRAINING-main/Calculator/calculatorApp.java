package Calculator;

class CalculatorApp {
    public static void main(String[] args) {

        Calculator add = (a, b) -> a + b;
        Calculator subtract = (a, b) -> a - b;
        Calculator multiply = (a, b) -> a * b;
        Calculator divide = (a, b) -> b != 0 ? a / b : 0;

        System.out.println("Addition (10 + 5): " + add.calculate(10, 5));
        System.out.println("Subtraction (10 - 5): " + subtract.calculate(10, 5));
        System.out.println("Multiplication (10 * 5): " + multiply.calculate(10, 5));
        System.out.println("Division (10 / 5): " + divide.calculate(10, 5));
    }
}