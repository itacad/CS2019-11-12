package by.it.givi.lesson05;

/*
Один большой массив и два маленьких
1. Создать массив m на 20 целых чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива a и b на 10 целых чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький,
    вторую половину во второй маленький.
5. Вывести массивы a и b на экран командами:
        System.out.println("a="+Arrays.toString(a));
        System.out.println("b="+Arrays.toString(b));

Например, для такого ввода
1 2 3 4 5 6 7 8 9 10 11 22 33 44 55 66 77 88 99 0

ожидается такой вывод:
a=[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
b=[11, 22, 33, 44, 55, 66, 77, 88, 99, 0]

*/

import java.util.Arrays;
import java.util.Scanner;

public class TaskB2 {
    public static void main(String[] args) {
        int[] m1 = new int[20];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 20; i++) {
            m1[i] = scanner.nextInt();
        }
        int [] m2 = new int [10];
        int [] m3 = new int [10];
        for (int i = 0, b=10; i < 10 && b <20 ;i++,b++){
            m2 [i] = m1[i];
            m3 [i] = m1[b];
        }
        System.out.println("a="+ Arrays.toString(m2));
        System.out.println("b="+Arrays.toString(m3));
    }
}
