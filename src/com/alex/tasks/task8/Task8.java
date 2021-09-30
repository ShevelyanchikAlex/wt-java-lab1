package com.alex.tasks.task8;

import com.alex.tasks.services.writer.impl.WriterImpl;
import com.alex.tasks.services.writer.interfaces.Writer;

import java.util.Arrays;

public class Task8 {

    public static void main(String[] args) {
        Writer writer = new WriterImpl();
        int[] arr1 = {1, 5, 7, 14};
        int[] arr2 = {0, 2, 4, 90};

        writer.write(Arrays.toString(findInsertionIndexes(arr1, arr2)));
    }

    private static int[] findInsertionIndexes(int[] arr1, int[] arr2) {
        int[] indexes = new int[arr2.length];
        for (int i = 0; i < arr2.length; i++) {
            boolean isInserted = false;
            for (int j = 0; j < arr1.length; j++) {
                if (arr1[j] >= arr2[i]) {
                    indexes[i] = j - 1;
                    isInserted = true;
                    break;
                }
            }
            if (!isInserted) {
                indexes[i] = arr1.length -1;
            }
        }
        return indexes;
    }


}
