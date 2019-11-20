package ru.levelup.roman.staune.qa.homework_1.task_1;

class Fibonacci extends Operation {
    @Override
    Number[] input() {
        System.out.print("Введите целое положительное число: ");
        int argument = CalculatorInput.readNaturalInt();
        return new Number[]{argument};
    }

    @Override
    void calculate(Number...operands) {
        int argument = (int) operands[0];
        long result;
        if (argument == 1 || argument == 2) {
            result = 1;
        } else {
            long[] sequenceTail = {0, 1, 1};
            for (int i = 2; i < argument; i++) {
                sequenceTail[0] = sequenceTail[1];
                sequenceTail[1] = sequenceTail[2];
                sequenceTail[2] = sequenceTail[0] + sequenceTail[1];
                if (sequenceTail[2] <= 0) {
                    System.out.println("Ошибка операции! Cлишком большой аргумент.");
                    return;
                }
            }
            result = sequenceTail[2];
        }
        System.out.format("Результат: %d%n", result);
    }
}
