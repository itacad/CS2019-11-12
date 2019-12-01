package by.it.zenevich.lesson05;

/* Задачка на сортировку
Задача: Написать программу, которая вводит с клавиатуры 20 чисел
и выводит их в убывающем порядке. Скорость O(n*n).
*/

import java.util.Arrays;
import java.util.Scanner;

public class TaskC2 {
    //Напишите тут ваш код
    public static void main(String[] args) {
        int[] array = new int[20];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 20; i++) {
            array[i] = scanner.nextInt();
        }
        sort(array);
        for (int element : array) {
            System.out.println(element);
        }

    }


    public static void sort(int[] array) {
        //Напишите тут ваш код
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] < array[j + 1]) {
                    int x = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = x;
                }
            }
        }
    }

}
