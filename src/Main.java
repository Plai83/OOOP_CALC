import logger.Log;

import java.util.logging.Level;
import java.util.logging.Logger;



public class Main {
    private static final Logger log = Log.log(Main.class.getName());
//    static Logger logger = Logger.getLogger(Main.class.getName());
    public static void main(String[] args) {
        log.log(Level.INFO, "Калькулятор запущен");
        ViewCalc viewCalc = new ViewCalc();
        viewCalc.run();
    }
}
