package ru.levelup.roman.staune.qa.homework_1.task_1;

import java.util.Scanner;

class CalculatorInput {
    String operationInput() {
        System.out.println("Введите номер нужной операции: \n" +
                "1 - сложение (double, double);\n" +
                "2 - вычитание (int, int);\n" +
                "3 - умножение (double, double);\n" +
                "4 - возведение в степень (int, double);\n" +
                "5 - вычисление факториала (int);\n" +
                "6 - вычисление n-го члена последовательности Фибоначчи (int)");
        Scanner in = new Scanner(System.in);
        return in.next();
    }

    Number[] inputTwoDoubleNumbers() {
        System.out.print("Введите первое число (double): ");
        double firstOperand = readDouble();
        System.out.print("Введите второе число (double): ");
        double secondOperand = readDouble();
        return new Double[]{firstOperand, secondOperand};
    }

    Number[] inputNaturalInt() {
        System.out.print("Введите целое положительное число: ");
        int argument = readNaturalInt();
        return new Number[]{argument};
    }

    Number[] inputNonNegativeInt() {
        System.out.print("Введите целое неотрицательное число: ");
        int argument = readNonNegativeInt();
        return new Number[]{argument};
    }

    Number[] inputTwoIntDoubleNumbers() {
        System.out.print("Введите степень (int): ");
        int firstOperand = readInt();
        System.out.print("Введите основание (double): ");
        double secondOperand = readDouble();
        return new Number[]{firstOperand, secondOperand};
    }

    Number[] inputTwoIntNumbers() {
        System.out.print("Введите первое число (int): ");
        int firstOperand = readInt();
        System.out.print("Введите второе число (int): ");
        int secondOperand = readInt();
        return new Integer[]{firstOperand, secondOperand};
    }

    private double readDouble() {
        Scanner in = new Scanner(System.in);
        return Double.parseDouble(in.next());
    }

    private int readInt() {
        Scanner in = new Scanner(System.in);
        return Integer.parseInt(in.next());
    }

    private int readNonNegativeInt() {
        Scanner in = new Scanner(System.in);
        int input = Integer.parseInt(in.next());
        if (input < 0) {
            throw new NumberFormatException();
        }
        return input;
    }

    private int readNaturalInt() {
        Scanner in = new Scanner(System.in);
        int input = Integer.parseInt(in.next());
        if (input <= 0) {
            throw new NumberFormatException();
        }
        return input;
    }
}
