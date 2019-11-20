package ru.levelup.roman.staune.qa.homework_1.task_1;

import java.util.Scanner;

class CalculatorInput {
    static String operationInput() {
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

    static double readDouble() {
        Scanner in = new Scanner(System.in);
        return Double.parseDouble(in.next());
    }

     static int readInt() {
        Scanner in = new Scanner(System.in);
        return Integer.parseInt(in.next());
    }

    static int readNonNegativeInt() {
        Scanner in = new Scanner(System.in);
        int input =  Integer.parseInt(in.next());
        if (input < 0) {
            throw new NumberFormatException();
        }
        return input;
    }

    static int readNaturalInt() {
        Scanner in = new Scanner(System.in);
        int input =  Integer.parseInt(in.next());
        if (input <= 0) {
            throw new NumberFormatException();
        }
        return input;
    }
}
