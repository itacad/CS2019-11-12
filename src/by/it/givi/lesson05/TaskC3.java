package by.it.givi.lesson05;

/* Задачка на сортировку2
Задача: Написать программу, которая вводит с клавиатуры 20 чисел
и выводит их в убывающем порядке. Скорость O(n log n)
*/

import java.util.Scanner;

public class TaskC3 {
    public static void main(String[] args) {
        int[] m = new int[20];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < m.length; i++) {
            m[i] = scan.nextInt();}
        int x = 0;
        int end = m.length - 1;
        Sort(m, x, end);
        for (int element : m) {
            System.out.println(element);
        }
    }
        public static void Sort(int[] m, int s, int end) {
            if (s >= end)
                return;
            int middle = m[s + (end-s) / 2];
            int i = s, j = end;
            while (i <= j) {
                while (m[i] > middle) {
                    i++;
                }
                while (m[j] < middle) {
                    j--;
                }
                if (i <= j) {
                    int temp = m[i];
                    m[i] = m[j];
                    m[j] = temp;
                    i++;
                    j--;
                }
            }
            if (s < j) {
                Sort(m, s, j);
            }
            if (i < end) {
                Sort(m, i, end);
            }

        }


    }