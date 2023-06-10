package at.campus02.bsd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {

    static Logger logger = LogManager.getLogger();

    public double add(double number1, double number2){
        logger.debug("addition with parameters " + number1 + " and " + number2);

        double result = number1+number2;
        return result;
    }

    public double minus(double number1, double number2){
        logger.debug("subtraction with parameters " + number1 + " and " + number2);

        double result = number1-number2;
        return result;
    }

    public double divide(double number1, double number2){
        logger.debug("division with parameters " + number1 + " and " + number2);

        double result = number1/number2;
        if(number2 == 0){
            logger.error("Division with zero not valid");
            throw new ArithmeticException();
        }
        return result;
    }

    public double multiply(double number1, double number2){
        logger.debug("multiplication with parameters " + number1 + " and " + number2);

        double result = number1*number2;
        return result;
    }

    public int faculty(int number){
        logger.debug("faculty with parameters " + number);

        if(number == 0){
            return  1;
        } else if (number < 0) {
            return 0;
        } else {
            int result = 1;
            for (int i = 1; i <= number; i++){
                result *= i;
            }
            return result;
        }
    }



}
