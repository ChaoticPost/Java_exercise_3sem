package org.example.task1;

public class task1_Exercise1 {
    public static void main(String[] args) {
        int[] array = {1, 3, 9, 2, 6, 4, 2, 5, 10, 9};
        int sum = 0;

        for (int item : array) {
            sum += item;
        }

        System.out.println("Sum of array numbers using a for loop: " + sum);

        int i = 0;
        sum = 0;

        while (i < array.length) {
            sum += array[i++];
        }

        System.out.println("Sum of array numbers using a while loop: " + sum);

        i = 0;
        sum = 0;

        do {
            sum += array[i++];
        } while (i < array.length);

        System.out.println("Sum of array numbers using a do while loop: " + sum);
    }
}
