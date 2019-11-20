package by.it.popkov.lesson03;

import java.util.Arrays;

public class TaskC2B {
    static void sumDigitsInNumber(int number) {
        int sum = 0;
        int[] array = new int[15];
        for (int i = 10; i >= 0; i--) {
            array[i] = number / (int) Math.pow(10, i) - array[i + 1] * 10 - array[i + 2] * 100 - array[i + 3] * 1000;

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

