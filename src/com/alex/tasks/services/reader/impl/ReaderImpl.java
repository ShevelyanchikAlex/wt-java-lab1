package com.alex.tasks.services.reader.impl;

import com.alex.tasks.services.reader.interfaces.Reader;
import com.alex.tasks.services.validator.impl.ValidatorImpl;
import com.alex.tasks.services.validator.interfaces.Validator;
import com.alex.tasks.services.writer.impl.WriterImpl;
import com.alex.tasks.services.writer.interfaces.Writer;

import java.util.Scanner;

public class ReaderImpl implements Reader {
    private final Scanner scanner;
    private final Writer writer;
    private final Validator validator;

    public ReaderImpl() {
        this.scanner = new Scanner(System.in);
        this.writer = new WriterImpl();
        this.validator = new ValidatorImpl();
    }

    @Override
    public double readDouble() {
        boolean isValid = false;
        String inputVal = "";

        while (!isValid) {
            writer.write("Input double value: ");
            inputVal = scanner.nextLine();
            isValid = validator.isValidDouble(inputVal);
        }
        return Double.parseDouble(inputVal);
    }

    @Override
    public int readInt() {
        boolean isValid = false;
        String inputVal = "";

        while (!isValid) {
            writer.write("Input int value: ");
            inputVal = scanner.nextLine();
            isValid = validator.isValidInt(inputVal);
        }
        return Integer.parseInt(inputVal);
    }
}
