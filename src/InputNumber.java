import java.util.Scanner;

public class InputNumber {
    Scanner scanner = new Scanner(System.in);
    public ComplexNumber input(){
        System.out.println("Введите реальную часть комплексного числа");
        double real = scanner.nextDouble();
        System.out.println("Введите реальную часть комплексного числа");
        double imaginary = scanner.nextDouble();
        return new ComplexNumber(real, imaginary);
    }
}
