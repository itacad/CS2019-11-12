package by.it.akalugina.lesson05;

/* Задачка на сортировку
Задача: Написать программу, которая вводит с клавиатуры 20 чисел
и выводит их в убывающем порядке. Скорость O(n*n).
*/

import java.util.ArrayList;
import java.util.Scanner;

public class TaskC2 {
    //Напишите тут ваш код
    public static void main(String[] args) {
        int list[];
        list=new int[20];
        Scanner scanner = new Scanner(System.in);
        for(int i=0;i<list.length;i++) {
            list[i]=scanner.nextInt();
        }
        sort(list);
    }




    public static void sort(int[] array) {
        //Напишите тут ваш код
        int sorty;
        for (int i = 1; i < array.length; i++) {
            sorty = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] < sorty) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = sorty;
        }
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }

}
