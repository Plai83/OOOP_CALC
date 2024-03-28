import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Controller {
    InputNumber inputNumber = new InputNumber();
    Map<String, List<Double>> mapOperations = new LinkedHashMap<>();
    public ComplexNumber getNumber(){
        return inputNumber.input();
    }
}
