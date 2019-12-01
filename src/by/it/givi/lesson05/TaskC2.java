package by.it.givi.lesson05;

/* Задачка на сортировку
Задача: Написать программу, которая вводит с клавиатуры 20 чисел
и выводит их в убывающем порядке. Скорость O(n*n).
*/

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class TaskC2 {
    public static void main(String[] args) {
        int[] m = new int[20];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < m.length; i++) {
            m[i] = scan.nextInt();
        }
        sort(m);
        for (int i : m) {
            System.out.println(i);
        }
    }

    public static void sort(int[] m) {

        for (int a = 1; a < m.length; a++) {
            for (int b = m.length - 1; b >= a; b--) {
                if (m[b - 1] < m[b]) {
                    int s = m[b - 1];
                    m[b - 1] = m[b];
                    m[b] = s;
                }

            }
        }
    }
}

//for (int a = 20 - 1; a >= 0; a--) {
//System.out.print(m1[a] + " ");
