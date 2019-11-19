package ru.levelup.roman.staune.qa.homework_1.task_1;

import java.util.Scanner;

public class Fibonacci extends Operation {
    private int argument;

    @Override
    boolean input() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите целое положительное число: ");
        String argument = in.next();
        return verifyInput(argument);
    }

    @Override
    void calculate() {
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

    private boolean verifyInput(String argument) {
        try {
            this.argument = Integer.parseInt(argument);
        } catch (NumberFormatException e) {
            System.out.println("Аргумент не типа int!");
            return false;
        }
        if (this.argument < 0) {
            System.out.println("Аргумент не положительный!");
            return false;
        }
        return true;
    }
}
