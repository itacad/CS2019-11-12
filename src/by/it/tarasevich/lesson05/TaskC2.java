package by.it.tarasevich.lesson05;

/* Задачка на сортировку
Задача: Написать программу, которая вводит с клавиатуры 20 чисел
и выводит их в убывающем порядке. Скорость O(n*n).
*/



import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class TaskC2 {
    public static void main(String[] args) {
        Integer [] m = new Integer[20];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < m.length; i++) {
            m[i] = scanner.nextInt();
        }
        sort(m);
    }
    public static void sort(Integer[] array) {
            Arrays.sort(array, Collections.reverseOrder());
           System.out.println(Arrays.toString(array));
    }

}
