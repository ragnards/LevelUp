package ru.levelup.roman.staune.qa.homework_3.task_1;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CalculatorDivisionTest {
    private final static double PRECISION = 0.0001;
    private Calculator calculator = new Calculator();

    @DataProvider
    public Object[][] longOperands() {
        return new Object[][]{
                {15, 3, 5},
                {15, 4, 3}
        };
    }

    @DataProvider
    public Object[][] doubleOperands() {
        return new Object[][]{
                {15.5, 5.0, 3.1},
                {3.3, 0.0, Double.POSITIVE_INFINITY}
        };
    }

    @Test(dataProvider = "longOperands", groups = "mult_div_tests")
    public void testDivisionLongOperands(long firstNum, long secondNum, long expected) {
        long actual = calculator.div(firstNum, secondNum);
        Assert.assertEquals(actual, expected);
    }

    @Test(dataProvider = "doubleOperands", groups = "mult_div_tests")
    public void testDivisionDoubleOperands(double firstNum, double secondNum, double expected) {
        long actual = calculator.div(firstNum, secondNum);
        Assert.assertEquals(actual, expected, PRECISION);
    }
}
