package by.it.zenevich.lesson05;
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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TaskC1 {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 20; i++) {
            Integer s = scanner.nextInt();
            list.add(s);
        }
        for (Integer x : list) System.out.println(list.get(x));
        
        ArrayList<Integer> mult3 = new ArrayList<>();
        ArrayList<Integer> mult2 = new ArrayList<>();
        ArrayList<Integer> other = new ArrayList<>();
        for (Integer x : list) {
            if (x % 3 == 0 && x % 2 == 0) {
                mult3.get(x);
                mult2.get(x);
            } else if (x % 3 == 0) {
                mult3.get(x);
            } else if (x % 2 == 0) {
                mult2.get(x);
            } else {
                other.get(x);
            }
        }
    }

    private static void printList(List<Integer> list) {
        for (Integer aList : list) System.out.println(aList);
    }


}
