package ru.levelup.roman.staune.qa.homework_1.task_1;

class Exponentiation implements Operation {
    @Override
    public Number[] input() {
        return input.inputTwoIntDoubleNumbers();
    }

    @Override
    public void calculate(Number... operands) {
        int power = (int) operands[0];
        double basis = (double) operands[1];
        double result = 1.0;
        for (int i = 0; i < Math.abs(power); i++) {
            result = result * basis;
        }
        if (power < 0) {
            result = 1 / result;
        }
        System.out.format("Результат: %.10f%n", result);
    }
}
