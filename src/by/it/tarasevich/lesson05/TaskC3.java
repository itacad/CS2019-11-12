package by.it.tarasevich.lesson05;

/* Задачка на сортировку2
Задача: Написать программу, которая вводит с клавиатуры 20 чисел
и выводит их в убывающем порядке. Скорость O(n log n)
*/

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class TaskC3 {
    public static void main(String[] args) {
        int[] m = new int[20];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < m.length; i++) {
            m[i] = scanner.nextInt();
        }
        sort(m);
    }


    public static void sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                if (array[j] < array[j + 1]) {
                    int a = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = a;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}

