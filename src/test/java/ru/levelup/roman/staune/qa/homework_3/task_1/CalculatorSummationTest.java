package ru.levelup.roman.staune.qa.homework_3.task_1;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.epam.tat.module4.Calculator;

public class CalculatorSummationTest {

    @DataProvider(name = "correctLongOperands")
    public Object[][] dataCorrectLongOperands() {
        return new Object[][]{
                {3, 5, 8},
                {0, 0, 0},
                {3, -5, -2},
                {-3, 5, 2},
                {-3, -5, -8},
                {2_150_000_000L, -10_000_000, 2_140_000_000L},
                {-10_000_000, 2_150_000_000L, 2_140_000_000L},
                {10_000_000, -2_150_000_000L, -2_140_000_000L},
                {-2_150_000_000L, 10_000_000, -2_140_000_000L},
                {2_000_000_000L, 1_000_000_000, 3_000_000_000L},
                {-1_000_000_000, -2_000_000_000L, -3_000_000_000L}
        };
    }

    @Test(dataProvider = "correctLongOperands")
    public void testSummationCorrectLongOperands(Long firstNum, Long secondNum, Long expected) {
        Calculator calculator = new Calculator();
        long actual = calculator.sum(firstNum, secondNum);
        Assert.assertEquals(actual, expected);
    }
}
