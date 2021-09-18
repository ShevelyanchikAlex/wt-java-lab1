package com.alex.tasks.task5;

import com.alex.tasks.servise.writer.impl.ConsWriter;
import com.alex.tasks.servise.writer.interfaces.Writer;

public class Task5 {

    public static void main(String[] args) {
        Writer writer = new ConsWriter();

        int[] sequence = {1, 3, -8, 0, 5, 7, 10};
        writer.write(String.valueOf(getMinAmountOfElements(sequence)));
    }

    public static int getMinAmountOfElements(int[] sequence) {
        int maxIncSequenceLength = 0;
        int currentIncSequenceLength;
        boolean isSequenceInc;

        for (int i = 0; i < sequence.length; i++) {
            isSequenceInc = true;
            currentIncSequenceLength = 1;
            for (int j = i + 1; (j < sequence.length) && isSequenceInc; j++) {
                if (sequence[j - 1] < sequence[j]) {
                    currentIncSequenceLength++;
                } else {
                    isSequenceInc = false;
                }
            }
            maxIncSequenceLength = Math.max(maxIncSequenceLength, currentIncSequenceLength);
        }
        return sequence.length - maxIncSequenceLength;
    }
}
