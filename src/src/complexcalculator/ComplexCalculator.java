package complexcalculator;

import java.util.logging.Logger;

public class ComplexCalculator implements Calculator {
    private static final Logger LOGGER = Logger.getLogger(ComplexCalculator.class.getName());

    public ComplexNumber add(ComplexNumber number1, ComplexNumber number2) {
        ComplexNumber result = number1.add(number2);
        LOGGER.info("Addition: " + number1 + " + " + number2 + " = " + result);
        return result;
    }

    public ComplexNumber multiply(ComplexNumber number1, ComplexNumber number2) {
        ComplexNumber result = number1.multiply(number2);
        LOGGER.info("Multiplication: " + number1 + " * " + number2 + " = " + result);
        return result;
    }

    public ComplexNumber divide(ComplexNumber number1, ComplexNumber number2) {
        ComplexNumber result = number1.divide(number2);
        LOGGER.info("Division: " + number1 + " / " + number2 + " = " + result);
        return result;
    }
}
