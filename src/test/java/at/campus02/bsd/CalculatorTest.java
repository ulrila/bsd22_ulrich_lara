package at.campus02.bsd;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @BeforeEach
    public void setUp(){
        calculator = new Calculator();
    }

    @AfterEach
    public void tearDown(){
        calculator = null;
    }

    /*
     * Tests for add Method
     */
    @Test
    public void testMethodAdd1(){
        assertEquals(3, calculator.add(1.5, 1.5));
    }

    @Test
    public void testMethodAdd2(){
        assertEquals(4, calculator.add(7, -3));
    }

    @Test
    public void testMethodAdd3(){
        assertEquals(-6, calculator.add(2, -8));
    }


    /*
     * Tests for minus Method
     */
    @Test
    public void testMethodMinus1(){
        assertEquals(1, calculator.minus(2, 1));
    }

    @Test
    public void testMethodMinus2(){
        assertEquals(11.5, calculator.minus(8, -3.5));
    }

    @Test
    public void testMethodMinus3(){
        assertEquals(-22, calculator.minus(-15, 7));
    }

    /*
     * Tests for divide Method
     */
    @Test
    public void testMethodDivide1(){
        assertEquals(5, calculator.divide(10, 2));
    }

    @Test
    public void testMethodDivide2(){
        assertEquals(8, calculator.divide(20, 2.5));
    }

    @Test
    public void testMethodDivide3(){
        assertEquals(-2, calculator.divide(-14, 7));
    }

    /*
     * Tests for multiply Method
     */
    @Test
    public void testMethodMultiply1(){
        assertEquals(29.6, calculator.multiply(8, 3.7));
    }

    @Test
    public void testMethodMultiply2(){
        assertEquals(0, calculator.multiply(32, 0));
    }

    @Test
    public void testMethodMultiply3(){
        assertEquals(-72, calculator.multiply(18, -4));
    }


    /*
     * Tests for faculty
     */
    @Test
    public void testMethodFaculty1(){
        assertEquals(-24, calculator.faculty(-4));
    }

    @Test
    public void testMethodFaculty2(){
        assertEquals(120, calculator.faculty(5));
    }

    @Test
    public void testMethodFaculty3(){
        assertEquals(5040, calculator.faculty(7));
    }


}
