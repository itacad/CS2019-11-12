package by.it.zenevich.lesson05;

/* Задачка на сортировку2
Задача: Написать программу, которая вводит с клавиатуры 20 чисел
и выводит их в убывающем порядке. Скорость O(n log n)
*/

import java.util.Arrays;
import java.util.Scanner;

public class TaskC3 {
    //Напишите тут ваш код
    public static void main(String[] args) {
        int[] number = new int[20];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 20; i++) {
            number[i] = scanner.nextInt();
        }
        int start = 0;
        int end = number.length - 1;
        Sort(number, start, end);
        for (int element : number) {
            System.out.println(element);
        }

    }

    public static void Sort(int[] array, int start, int end) {
        //Напишите тут ваш код
        if (start >= end)
            return;//завершить выполнение если уже нечего делить
        // выбрать опорный элемент
        int middle = array[start + (end-start) / 2];
        // разделить на подмассивы, который больше и меньше опорного элемента
        int i = start, j = end;
        while (i <= j) {
            while (array[i] > middle) {
                i++;
            }
            while (array[j] < middle) {
                j--;
            }
            if (i <= j) {//меняем местами
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        // вызов рекурсии для сортировки левой и правой части
        if (start < j) {
            Sort(array, start, j);
        }
        if (i < end) {
            Sort(array, i, end);
        }

    }


}
