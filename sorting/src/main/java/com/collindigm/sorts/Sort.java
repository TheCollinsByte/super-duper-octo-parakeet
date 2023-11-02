package com.collindigm.sorts;

public class Sort {
    static String[] BubbleSort(String[] values) {
        var size = values.length;
        while (size > 1) {
            for (var j = 0; j < size - 1; j++) {
                if (values[j].compareTo(values[ j + 1 ]) > 0) {
                    final var tmp = values[j + 1];
                    values[j + 1] = values[j];
                    values[j] = tmp;
                }
            }
            size--;
        }
        return values;
    }
}
