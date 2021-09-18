package com.alex.tasks.servise.reader.impl;

import com.alex.tasks.servise.reader.interfaces.Reader;

import java.util.Scanner;

public class ConsReader implements Reader {
    private final Scanner scanner;

    public ConsReader() {
        this.scanner = new Scanner(System.in);
    }

    @Override
    public double readDouble() {
        double number = 0;
        boolean isValid = false;

        while (!isValid) {
            try {
                number = Integer.parseInt(scanner.nextLine());
                isValid = true;
            } catch (NumberFormatException e) {
                System.out.println("Error: Invalid input format!\n Try again to input value.");
            }
        }
        return number;
    }

    @Override
    public int readInt() {
        int number = 0;
        boolean isValid = false;

        while (!isValid) {
            try {
                number = Integer.parseInt(scanner.nextLine());
                isValid = true;
            } catch (NumberFormatException e) {
                System.out.println("Error: Invalid input format!\n Try again to input value.");
            }
        }
        return number;
    }
}
