package by.it.popkov.lesson03;

import java.util.Arrays;

public class TaskC2B {
    static void sumDigitsInNumber(int number) {
        int sum = 0;
        int[] array = new int[15];
        for (int i = 10, j = 0; i >= 0; i--, j++) {
            array[i] = number / (int) Math.pow(10, i) - array[i + j] * (int) Math.pow(10, j);

            /* Надо приобразовать действия после знака - */
        }
        for (int x : array) {
            sum = sum + x;
        }
        System.out.println(Arrays.toString(array));
        System.out.println(sum);
    }


    public static void main(String[] args) {
        sumDigitsInNumber(54671);
        System.out.println();

    }

}

