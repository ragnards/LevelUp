package ru.levelup.roman.staune.qa.homework_1.task_1;

class Subtraction implements Operation {
    @Override
    public Number[] input() {
        return input.inputTwoIntNumbers();
    }

    @Override
    public void calculate(Number... operands) {
        long firstOperand = (int) operands[0];
        long secondOperand = (int) operands[1];
        System.out.format("Результат: %d%n", firstOperand - secondOperand);
    }
}
