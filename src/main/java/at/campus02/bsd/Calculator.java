package at.campus02.bsd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {

    /**
     * This class Calculator has 5 methods
     * it has 4 methods for the basic arithmetic operations and 1 for the faculty
     * The basic arithmetic operation methods work with two parameter number1 and number2
     * The faculty method only uses one parameter - number
     *
     * @author Lara Ulrich
     */

    static Logger logger = LogManager.getLogger();

    /**
     * This method adds number2 to number1
     * @param number1
     * @param number2
     * @return sum = result of the addition
     */
    public double add(double number1, double number2){
        logger.debug("addition with parameters " + number1 + " and " + number2);

        double result = number1+number2;
        return result;
    }

    /**
     * This method subtracts number2 from number1
     * @param number1
     * @param number2
     * @return differnce = result of the subtraction
     */
    public double minus(double number1, double number2){
        logger.debug("subtraction with parameters " + number1 + " and " + number2);

        double result = number1-number2;
        return result;
    }

    /**
     * This method divides number1 by number2
     * @param number1
     * @param number2
     * @throws ArithmeticException
     * @return quotient = result of the division
     */
    public double divide(double number1, double number2){
        logger.debug("division with parameters " + number1 + " and " + number2);

        double result = number1/number2;
        if(number2 == 0){
            logger.error("Division with zero not valid");
            throw new ArithmeticException();
        }
        return result;
    }

    /**
     * This method multiplies the two numbers
     * @param number1
     * @param number2
     * @return product = result of the multiplication
     */
    public double multiply(double number1, double number2){
        logger.debug("multiplication with parameters " + number1 + " and " + number2);

        double result = number1*number2;
        return result;
    }

    /**
     * this method calculates the faculty of the number
     * @param number
     * @return faculty of number
     */
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
