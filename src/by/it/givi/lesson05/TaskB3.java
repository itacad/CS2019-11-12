package by.it.givi.lesson05;

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

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class TaskB3 {
    public static void main(String[] args) {
        int[] m1 = new int[10];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            m1[i] = scan.nextInt();
        }
        int first = m1[0];
        int last = m1[9];
        Arrays.sort(m1);
        int p =0;
        int k =0;
        for(int i = 0; i < 10; i++){
            if(first==m1[i]) p=i;
            if(last ==m1[i]) k=i;
        }
        System.out.println("Index of first element="+p);
        System.out.println("Index of last element="+k);
    }
}