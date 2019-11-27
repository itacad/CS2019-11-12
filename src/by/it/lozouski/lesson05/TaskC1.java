package by.it.lozouski.lesson05;
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
import java.util.List;
import java.util.Scanner;

public class TaskC1 {
    public static void main(String[] args){
        Scanner sc1 = new Scanner(System.in);
        ArrayList<Integer> listFirst = new ArrayList<>();
        ArrayList<Integer> listSecond = new ArrayList<>();
        ArrayList<Integer> listThird = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            int addedNum = sc1.nextInt();
            if (addedNum % 3 == 0 && addedNum % 2 == 0) {
                listFirst.add(addedNum);
                listSecond.add(addedNum);
            }else if (addedNum % 3 == 0){
                listFirst.add(addedNum);
            }else if(addedNum % 2 == 0){
                listSecond.add(addedNum);
            }
            else listThird.add(addedNum);
        }
        printList(listFirst);
        printList(listSecond);
        printList(listThird);
    }

    private static void printList(List<Integer> list) {
        for (Integer s : list) System.out.println(s);
    }


}
