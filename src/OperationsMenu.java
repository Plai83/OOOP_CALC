import java.util.Scanner;

public class OperationsMenu {
    Scanner scanner = new Scanner(System.in);
    public String menuPrint(){
        String strOperations = "+-*/q";
        while (true){
            System.out.println("Выбрите желаемую операцию");
            System.out.println("-------");
            System.out.println("'+' Сложение");
            System.out.println("'-' Вычитание");
            System.out.println("'*' Умножение");
            System.out.println("'/' Деление");
            System.out.println("'Q' Выход");
            System.out.println("-------");
            String operation = scanner.next().toLowerCase();
            if (strOperations.contains(operation)){
                return operation;
            } else{
                System.out.println("Ввели не верную операцию, введите операцию из списка или 'exit' для выхода");
            }
        }

    }
}
