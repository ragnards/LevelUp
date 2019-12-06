package ru.levelup.roman.staune.qa.homework_3.task_1;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CalculatorMultiplyTest {
    private final static double PRECISION = 0.0001;
    private Calculator calculator = new Calculator();

    @DataProvider
    public Object[][] longOperands() {
        return new Object[][]{
                {3, 5, 15},
                {5, 0, 0}
        };
    }

    @DataProvider
    public Object[][] doubleOperands() {
        return new Object[][]{
                {1.22, 5.0, 6.1},
                {3.3, 0.0, 0.0}
        };
    }

    @Test(dataProvider = "longOperands", groups = "mult_div_tests")
    public void testMultiplyLongOperands(long firstNum, long secondNum, long expected) {
        long actual = calculator.mult(firstNum, secondNum);
        Assert.assertEquals(actual, expected);
    }

    @Test(dataProvider = "doubleOperands", groups = "mult_div_tests")
    public void testMultiplyDoubleOperands(double firstNum, double secondNum, double expected) {
        long actual = calculator.mult(firstNum, secondNum);
        Assert.assertEquals(actual, expected, PRECISION);
    }
}
