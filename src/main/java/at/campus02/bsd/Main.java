package at.campus02.bsd;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    public static void main(String[] args) {

        Logger logger = LogManager.getLogger();

        double num1 = 10;
        double num2 = 2;

        Calculator calculator = new Calculator();
        System.out.println("Addition: " + calculator.add(num1, num2));
        System.out.println("Subtraction: " + calculator.minus(num1, num2));
        System.out.println("Division: " + calculator.divide(num1, num2));
        System.out.println("Multiplication: " + calculator.multiply(num1, num2));
        
        logger.info("It is a info logger.");
        logger.error("It is an error logger.");





    }

}