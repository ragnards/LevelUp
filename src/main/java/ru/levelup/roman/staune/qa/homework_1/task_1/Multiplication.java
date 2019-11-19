package ru.levelup.roman.staune.qa.homework_1.task_1;

import java.util.Scanner;

public class Multiplication extends Operation {
    private double firstOperand;
    private double secondOperand;

    @Override
    boolean input() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число (double): ");
        String firstOperand = in.next();
        System.out.print("Введите второе число (double): ");
        String secondOperand = in.next();
        return verifyInput(firstOperand, secondOperand);
    }

    @Override
    void calculate() {
        System.out.format("Результат: %.3f%n", firstOperand * secondOperand);
    }

    private boolean verifyInput(String firstOperand, String secondOperand) {
        try {
            this.firstOperand = Double.parseDouble(firstOperand);
        } catch (NumberFormatException e) {
            System.out.println("Первый аргумент не типа double!");
            return false;
        }

        try {
            this.secondOperand = Double.parseDouble(secondOperand);
        } catch (NumberFormatException e) {
            System.out.println("Второй аргумент не типа double!");
            return false;
        }
        return true;
    }
}
