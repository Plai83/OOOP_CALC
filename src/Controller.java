public class Controller {
    InputNumber inputNumber = new InputNumber();
    OperationsMenu stringOperation = new OperationsMenu();
    Model model = new Model();
    public ComplexNumber getNumber(){
        return inputNumber.input();
    }

    public String getOperation(){
        return stringOperation.menuPrint();
    }

    public String getAddition(ComplexNumber numbA, ComplexNumber numbB){
        return model.addition(numbA, numbB);
    }
    public String getSubtract(ComplexNumber numbA, ComplexNumber numbB){
        return model.subtract(numbA, numbB);
    }
    public String getMultiplication(ComplexNumber numbA, ComplexNumber numbB){
        return model.multiplication(numbA, numbB);
    }
    public String getDivision(ComplexNumber numbA, ComplexNumber numbB){
        return model.division(numbA, numbB);
    }

}
