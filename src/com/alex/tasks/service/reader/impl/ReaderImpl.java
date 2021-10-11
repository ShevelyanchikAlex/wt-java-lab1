package com.alex.tasks.service.reader.impl;

import com.alex.tasks.service.reader.Reader;

import java.util.Scanner;

public class ReaderImpl implements Reader {
    private static ReaderImpl instance;

    private final Scanner scanner;

    private ReaderImpl() {
        this.scanner = new Scanner(System.in);
    }

    public static ReaderImpl getInstance() {
        if (instance == null) {
            instance = new ReaderImpl();
        }
        return instance;
    }

    @Override
    public double readDouble() {
        boolean isValid = false;
        double number = 0.0;

        while (!isValid) {
            if (scanner.hasNextDouble()) {
                number = scanner.nextDouble();
                isValid = true;
            } else {
                scanner.nextLine();
            }
        }
        return number;
    }

    @Override
    public int readInt() {
        boolean isValid = false;
        int number = 0;

        while (!isValid) {
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                isValid = true;
            } else {
                scanner.nextLine();
            }
        }
        return number;
    }

}
