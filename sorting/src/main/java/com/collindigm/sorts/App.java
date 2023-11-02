package com.collindigm.sorts;

public class App {
    public static void main(String[] args) {
        String[] unsorted = {"John", "Zed", "Abraham", "Matt", "Ninja", "Kelvin", "Jane"};
        String[] sorted = Sort.BubbleSort(unsorted);
        for (final String names : sorted) {
            System.out.println(names);
        }
    }
}
