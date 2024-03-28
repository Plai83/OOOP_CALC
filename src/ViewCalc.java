import logger.Log;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ViewCalc {
    Controller controller = new Controller();
    private static final Logger log = Log.log(ViewCalc.class.getName());
    public void run(){
        System.out.println("Введите первое комплексное число");
        ComplexNumber number1 = controller.getNumber();
        log.log(Level.INFO, "Первое число введено");
        System.out.println("Введите второе комплексное число");
        ComplexNumber number2 = controller.getNumber();
        log.log(Level.INFO, "Второе число введено");
        String operation = controller.getOperation();
        log.log(Level.INFO, "Знак операции введен");
        switch (operation){
            case "+":
                log.log(Level.INFO, "Сумма посчитана, программа закрывается");
                System.out.println(controller.getAddition(number1, number2));
                break;
            case "-":
                log.log(Level.INFO, "Разность посчитана, программа закрывается");
                System.out.println(controller.getSubtract(number1, number2));
                break;
            case "*":
                log.log(Level.INFO, "Умножение посчитано, программа закрывается");
                System.out.println(controller.getMultiplication(number1, number2));
                break;
            case "/":
                log.log(Level.INFO, "Деление посчитано, программа закрывается");
                System.out.println(controller.getDivision(number1, number2));
                break;
            case "q":
                log.log(Level.INFO, "Пользователь вышел с помощью команды Q");
                break;

        }
    }

}
