package ru.levelup.roman.staune.qa.homework_3.task_1;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CalculatorSummationTest {
    private Calculator calculator = new Calculator();

    @DataProvider
    public Object[][] longOperands() {
        return new Object[][]{
                {3, 5, 8},
                {-3, -5, -8}
        };
    }

    @DataProvider
    public Object[][] doubleOperands() {
        return new Object[][]{
                {3.3, 5.5, 8.8},
                {-3.3, -5.5, -8.8}
        };
    }

    @Test(dataProvider = "longOperands", groups = "sum_sub_tests")
    public void testSummationLongOperands(long firstNum, long secondNum, long expected) {
        long actual = calculator.sum(firstNum, secondNum);
        Assert.assertEquals(actual, expected);
    }

    @Test(dataProvider = "doubleOperands", groups = "sum_sub_tests")
    public void testSummationDoubleOperands(double firstNum, double secondNum, double expected) {
        double actual = calculator.sum(firstNum, secondNum);
        Assert.assertEquals(actual, expected);
    }
}
