package ru.levelup.roman.staune.qa.homework_1.task_1;

interface Operation {
    CalculatorInput input = new CalculatorInput();

    Number[] input();
    void calculate(Number... operands);
}
