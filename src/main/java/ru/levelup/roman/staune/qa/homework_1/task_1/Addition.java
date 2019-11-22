package ru.levelup.roman.staune.qa.homework_1.task_1;

class Addition implements Operation {
    @Override
    public Number[] input() {
        return input.inputTwoDoubleNumbers();
    }

    @Override
    public void calculate(Number... operands) {
        double firstOperand = (double) operands[0];
        double secondOperand = (double) operands[1];
        System.out.format("Результат: %.7f%n", firstOperand + secondOperand);
    }
}
