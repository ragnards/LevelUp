package ru.levelup.roman.staune.qa.homework_1.task_1;

class Subtraction extends Operation {
    @Override
    Number[] input() {
        System.out.print("Введите первое число (int): ");
        int firstOperand = CalculatorInput.readInt();
        System.out.print("Введите второе число (int): ");
        int secondOperand = CalculatorInput.readInt();
        return new Integer[]{firstOperand, secondOperand};
    }

    @Override
    void calculate(Number...operands) {
        long firstOperand = (int) operands[0];
        long secondOperand = (int) operands[1];
        System.out.format("Результат: %d%n", firstOperand - secondOperand);
    }
}
