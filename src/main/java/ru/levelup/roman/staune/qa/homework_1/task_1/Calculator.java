package ru.levelup.roman.staune.qa.homework_1.task_1;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.exit;

public class Calculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.startApplication();
    }

    public void startApplication() {
        System.out.println("Введите номер нужной операции: \n" +
                           "1 - сложение (double, double);\n" +
                           "2 - вычитание (int, int);\n" +
                           "3 - умножение (double, double);\n" +
                           "4 - возведение в степень (int, double);\n" +
                           "5 - вычисление факториала (int);\n" +
                           "6 - вычисление n-го члена последовательности Фибоначчи (int)");
        Scanner in = new Scanner(System.in);
        String chosenOperation = in.next();
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
        if (operation.input()) {
            operation.calculate();
        }
    }

    private double readDouble() {
        Scanner in = new Scanner(System.in);
        return Double.parseDouble(in.next());
    }

    private int readInt() {
        Scanner in = new Scanner(System.in);
        return Integer.parseInt(in.next());
    }

    private int readNotNegativeInt() {
        Scanner in = new Scanner(System.in);
        int input =  Integer.parseInt(in.next());
        if (input < 0) {
            throw new NumberFormatException();
        }
        return input;
    }

    private int readNaturalInt() {
        Scanner in = new Scanner(System.in);
        int input =  Integer.parseInt(in.next());
        if (input <= 0) {
            throw new NumberFormatException();
        }
        return input;
    }
}
