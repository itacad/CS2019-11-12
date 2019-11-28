package by.it.tarasevich.lesson05;

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
        int min = m[0];
        int max = m[0];
        int minInd = 0;
        int maxInd = 0;
        for (int i = 0; i < m.length; i++) {
            if (m[i] < min) min = m[i];
            if (m[i] > max) max = m[i];
            minInd = i;
            maxInd = i;
        }
        Arrays.sort(m);
        System.out.println(Arrays.toString(m));

        System.out.println("Index of first element=" + minInd);
        System.out.println("Index of last element=" + maxInd);
    }
}
