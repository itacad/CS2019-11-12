package by.it.zenevich.lesson05;

/*
Минимум и максимум
1. Создать массив m на 10 целых чисел.
2. Ввести в него значения с клавиатуры.
3. Отсортируйте массив любым способом
4. Выполните вычисление новых (после сортировки)
индексов первого и последнего элемента
исходного массива и выведите их в виде:
Index of first element=???
Index of last element=???

Например, для такого ввода
123 99 88 77 66 5 4 3 0 2

ожидается такой вывод:
Index of first element=9
Index of last element=1

*/

import java.util.Arrays;
import java.util.Scanner;

public class TaskB3 {
    public static void main(String[] args) {
        int[] m = new int[10];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < m.length; i++) {
            m[i] = scanner.nextInt();
        }
        int a = m[0];
        int b = m[m.length - 1];
        bubbleSort(m);
        int index_a = 0;
        int index_b = 0;
        for (int i = 0; i < m.length; i++) {
            if (a == m[i]) index_a = i;
            if (b == m[i]) index_b = i;
        }

        System.out.println("Index of first element=" + index_a);
        System.out.println("Index of last element=" + index_b);

    }

    private static void bubbleSort(int[] m) {
        for (int i = m.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (m[j] > m[j + 1]) {
                    int x = m[j];
                    m[j] = m[j + 1];
                    m[j + 1] = x;
                }
            }
        }
    }
}
