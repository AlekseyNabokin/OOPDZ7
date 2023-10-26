package complexcalculator;

import java.util.Objects;

public record ComplexNumber(double realPart, double imaginaryPart) {

    public ComplexNumber add(ComplexNumber other) {
        double real = realPart + other.realPart();
        double imaginary = imaginaryPart + other.imaginaryPart();
        return new ComplexNumber(real, imaginary);
    }

    public ComplexNumber multiply(ComplexNumber other) {
        double real = realPart * other.realPart() - imaginaryPart * other.imaginaryPart();
        double imaginary = realPart * other.imaginaryPart() + imaginaryPart * other.realPart();
        return new ComplexNumber(real, imaginary);
    }

    public ComplexNumber divide(ComplexNumber other) {
        double divisor = other.realPart() * other.realPart() + other.imaginaryPart() * other.imaginaryPart();
        double real = (realPart * other.realPart() + imaginaryPart * other.imaginaryPart()) / divisor;
        double imaginary = (imaginaryPart * other.realPart() - realPart * other.imaginaryPart()) / divisor;
        return new ComplexNumber(real, imaginary);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (ComplexNumber) obj;
        return Double.doubleToLongBits(this.realPart) == Double.doubleToLongBits(that.realPart) &&
                Double.doubleToLongBits(this.imaginaryPart) == Double.doubleToLongBits(that.imaginaryPart);
    }

    @Override
    public String toString() {
        return "ComplexNumber[" +
                "realPart=" + realPart + ", " +
                "imaginaryPart=" + imaginaryPart + ']';
    }


}
