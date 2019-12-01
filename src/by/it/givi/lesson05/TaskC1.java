package by.it.givi.lesson05;
/*
Три массива
1.  Введите с клавиатуры 20 чисел, сохраните их в список и
    рассортируйте по трём другим спискам:
    Число делится на 3 (x%3==0), делится на 2 (x%2==0) и все остальные.
    Числа, которые делятся на 3 и на 2 одновременно, например 6,
    попадают в оба списка.
2.  Статический метод void printList(List<Integer> list) должен
    выводить на экран все элементы переданного ему списка list,
    каждый элемент - с новой строки.
3.  Используя метод printList выведите ваши три списка на экран.
    Сначала тот, который для x%3, потом тот, который для x%2,
    потом последний.
*/

import java.lang.reflect.Array;
import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class TaskC1 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> main = new ArrayList<Integer>();
        ArrayList<Integer> l2 = new ArrayList<Integer>();
        ArrayList<Integer> l3 = new ArrayList<Integer>();
        ArrayList<Integer> trash = new ArrayList<Integer>();
        for (int i = 0; i < 20; i++) {
            main.add(scan.nextInt());
        }
        for (Integer a : main) {
            if (a % 2 == 0 /*& a != 0*/) {
                l2.add(a);
            }
            if (a % 3 == 0 /*& a != 0*/) {
                l3.add(a);
            }
            if (a % 2 != 0 && a % 3 != 0) {
                trash.add(a);
            }
        }
        printList(l3);
        printList(l2);
        printList(trash);
    }

    private static void printList(List<Integer> list) {
        for (Integer aList : list) System.out.println(aList);
    }
}




