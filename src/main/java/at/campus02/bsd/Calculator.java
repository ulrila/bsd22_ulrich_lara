package at.campus02.bsd;

public class Calculator {


    public double add(double number1, double number2){
        double result = number1+number2;
        return result;
    }

    public double minus(double number1, double number2){
        double result = number1-number2;
        return result;
    }

    public double divide(double number1, double number2){
        double result = number1/number2;
        return result;
    }

    public double multiply(double number1, double number2){
        double result = number1*number2;
        return result;
    }

    public int faculty(int number){

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
