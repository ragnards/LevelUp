package ru.levelup.roman.staune.qa.homework_1.task_1;

import static java.lang.System.exit;

public class Calculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.startApplication();
    }

    private void startApplication() {
        String chosenOperation = CalculatorInput.operationInput();
        Operation operation = null;
        switch (chosenOperation) {
            case "1":
                operation = new Addition();
                break;
            case "2":
                operation = new Subtraction();
                break;
            case "3":
                operation = new Multiplication();
                break;
            case "4":
                operation = new Exponentiation();
                break;
            case "5":
                operation = new Factorial();
                break;
            case "6":
                operation = new Fibonacci();
                break;
            default:
                System.out.println("Выбрана неверная операция!");
                exit(0);
        }
        try {
            Number[] operands = operation.input();
            operation.calculate(operands);
        } catch (NumberFormatException e) {
            System.out.println("Введен неверный аргумент!");
        }
    }
}
