package complexcalculator;

public class Main {
    public static void main(String[] args) {
        ComplexNumber number1 = new ComplexNumber(2, 3);
        ComplexNumber number2 = new ComplexNumber(4, 5);

        Calculator calculator = new ComplexCalculator();

        ComplexNumber sum = calculator.add(number1, number2);
        ComplexNumber product = calculator.multiply(number1, number2);
        ComplexNumber quotient = calculator.divide(number1, number2);
    }
}
