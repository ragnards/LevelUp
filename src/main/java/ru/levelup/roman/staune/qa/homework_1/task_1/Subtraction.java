package ru.levelup.roman.staune.qa.homework_1.task_1;

import java.util.Scanner;

public class Subtraction extends Operation {
    private long firstOperand;
    private long secondOperand;

    @Override
    boolean input() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число (int): ");
        String firstOperand = in.next();
        System.out.print("Введите второе число (int): ");
        String secondOperand = in.next();
        return verifyInput(firstOperand, secondOperand);
    }

    @Override
    void calculate() {
        System.out.format("Результат: %d%n", firstOperand - secondOperand);
    }

    private boolean verifyInput(String firstOperand, String secondOperand) {
        try {
            this.firstOperand = Integer.parseInt(firstOperand);
        } catch (NumberFormatException e) {
            System.out.println("Первый аргумент не типа int!");
            return false;
        }

        try {
            this.secondOperand = Integer.parseInt(secondOperand);
        } catch (NumberFormatException e) {
            System.out.println("Второй аргумент не типа int!");
            return false;
        }
        return true;
    }
}
