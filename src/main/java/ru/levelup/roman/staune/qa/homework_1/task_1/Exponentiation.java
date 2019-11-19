package ru.levelup.roman.staune.qa.homework_1.task_1;

import java.util.Scanner;

public class Exponentiation extends Operation {
    private int power;
    private double basis;

    @Override
    boolean input() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите степень (int): ");
        String firstOperand = in.next();
        System.out.print("Введите основание (double): ");
        String secondOperand = in.next();
        return verifyInput(firstOperand, secondOperand);
    }

    @Override
    void calculate() {
        Double result = 1.0;
        for (int i = 0; i < power; i++) {
            result = result * basis;
        }
        System.out.format("Результат: %.3f%n", result);
    }

    private boolean verifyInput(String firstOperand, String secondOperand) {
        try {
            power = Integer.parseInt(firstOperand);
        } catch (NumberFormatException e) {
            System.out.println("Первый аргумент не типа int!");
            return false;
        }

        try {
            basis = Double.parseDouble(secondOperand);
        } catch (NumberFormatException e) {
            System.out.println("Второй аргумент не типа double!");
            return false;
        }
        return true;
    }
}
