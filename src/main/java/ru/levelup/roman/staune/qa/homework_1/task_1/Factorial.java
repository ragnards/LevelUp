package ru.levelup.roman.staune.qa.homework_1.task_1;

import java.util.Scanner;

public class Factorial extends Operation {
    private int argument;

    @Override
    boolean input() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите целое неотрицательное число: ");
        String argument = in.next();
        return verifyInput(argument);
    }

    @Override
    void calculate() {
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

    private boolean verifyInput(String argument) {
        try {
            this.argument = Integer.parseInt(argument);
        } catch (NumberFormatException e) {
            System.out.println("Аргумент не типа int!");
            return false;
        }
        if (this.argument < 0) {
            System.out.println("Отрицательный аргумент!");
            return false;
        }
        return true;
    }
}
