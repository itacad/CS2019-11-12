package by.it.lozouski.lesson05;

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

0 2 3 4 5 66 77 88 99 123

ожидается такой вывод:
Index of first element=9
Index of last element=1

*/

import java.util.Scanner;

public class TaskB3 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int[] mas = new int[10];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = sc1.nextInt();
        }
        int temp;
        boolean sorted = false;
        int firstElement = mas[0];
        int lastElement = mas[9];

        while (!sorted) {
            sorted = true;
            for (int i = 0; i < mas.length - 1; i++) {
                if (mas[i] > mas[i + 1]) {
                    sorted = false;
                    temp = mas[i];
                    mas[i] = mas[i + 1];
                    mas[i + 1] = temp;
                }
            }
        }

        for (int i = 0; i < mas.length; i++) {
            if (mas[i] == firstElement) firstElement = i;
            if (mas[i] == lastElement) lastElement = i;
        }
        System.out.println("Index of first element=" + firstElement);
        System.out.println("Index of last element=" + lastElement);
    }
}
