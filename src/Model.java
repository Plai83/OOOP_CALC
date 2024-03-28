class Model implements Operations<ComplexNumber> {

    @Override
    public String addition(ComplexNumber number1, ComplexNumber number2) {
        double realNumb = number1.getReal() + number2.getReal();
        double imaginary = number1.getImaginary() + number2.getImaginary();
        return String.format("%.2f + %.2fi", realNumb, imaginary);
    }

    @Override
    public String subtract(ComplexNumber number1, ComplexNumber number2) {
        double realNumb = number1.getReal() - number2.getReal();
        double imaginary = number1.getImaginary() - number2.getImaginary();
        return String.format("%.2f + %.2fi", realNumb, imaginary);
    }

    @Override
    public String multiplication(ComplexNumber number1, ComplexNumber number2) {
        // Формула умножения (a * c-b * d)+(a * d+b * c)
        double realNumb = number1.getReal() * number2.getReal() -
                number1.getImaginary() * number2.getImaginary();
        double imaginary = number1.getReal() * number2.getImaginary() +
                number1.getImaginary() * number2.getReal();
        return String.format("%.2f + %.2fi", realNumb, imaginary);

    }

    @Override
    // Формула деления (a * c + b * d) / (c * c + d * d) + ((c * b - a * d) / (c * c + d * d)) * i
    public String division(ComplexNumber number1, ComplexNumber number2) {
        double realNumb = (number1.getReal() * number2.getReal() + number1.getImaginary() * number2.getImaginary())/
                (Math.pow(number2.getReal(), 2) + Math.pow(number2.getImaginary(), 2));
        double imaginary = (number2.getReal() * number1.getImaginary() - number1.getReal() *number2.getImaginary()) /
                (Math.pow(number2.getReal(), 2) + Math.pow(number2.getImaginary(), 2));
        return String.format("%.2f + %.2fi", realNumb, imaginary);
    }
}
