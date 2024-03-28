import java.util.Scanner;

public class ViewCalc {
    Scanner scanner = new Scanner(System.in);
    InputNumber inputNumber = new InputNumber();
    Controller controller = new Controller();
    public void run(){
        System.out.println("Введите первое комплексное число");
        controller.getNumber();
        System.out.println("Введите второе комплексное число");
        controller.getNumber();
    }

}
