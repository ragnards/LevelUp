package ru.levelup.roman.staune.qa.homework_1.task_1;

class Addition extends Operation {
    @Override
    Number[] input() {
        System.out.print("Введите первое число (double): ");
        double firstOperand = CalculatorInput.readDouble();
        System.out.print("Введите второе число (double): ");
        double secondOperand = CalculatorInput.readDouble();
        return new Double[]{firstOperand, secondOperand};
    }

    @Override
    void calculate(Number...operands) {
        double firstOperand = (double) operands[0];
        double secondOperand = (double) operands[1];
        System.out.format("Результат: %.7f%n", firstOperand + secondOperand);
    }
}
