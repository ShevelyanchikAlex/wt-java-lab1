package com.alex.tasks.services.validator.impl;


import com.alex.tasks.services.validator.interfaces.Validator;
import com.alex.tasks.services.writer.impl.WriterImpl;
import com.alex.tasks.services.writer.interfaces.Writer;

public class ValidatorImpl implements Validator {
    private final Writer writer;

    public ValidatorImpl() {
        this.writer = new WriterImpl();
    }


    @Override
    public boolean isValidDouble(String inputValue) {
        boolean isValid = false;

        try {
            Double.parseDouble(inputValue);
            isValid = true;
        } catch (NumberFormatException e) {
            writer.writeLn("Error: Invalid input format!\n Try again to input value.");
        }
        return isValid;
    }

    @Override
    public boolean isValidInt(String inputValue) {
        boolean isValid = false;

        try {
            Integer.parseInt(inputValue);
            isValid = true;
        } catch (NumberFormatException e) {
            writer.writeLn("Error: Invalid input format!\n Try again to input value.");
        }
        return isValid;
    }
}
