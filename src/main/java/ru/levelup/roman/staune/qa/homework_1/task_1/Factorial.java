package ru.levelup.roman.staune.qa.homework_1.task_1;

class Factorial implements Operation {
    @Override
    public Number[] input() {
        return input.inputNonNegativeInt();
    }

    @Override
    public void calculate(Number... operands) {
        int argument = (int) operands[0];
        long result = 1;
        for (int i = 1; i <= argument; i++) {
            result = result * i;
            if (result <= 0) {
                System.out.println("Ошибка операции! Cлишком большой аргумент.");
                return;
            }
        }
        System.out.format("Результат: %d%n", result);
    }
}
