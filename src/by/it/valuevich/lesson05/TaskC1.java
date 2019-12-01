package by.it.valuevich.lesson05;
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

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//public class TaskC1 {
//    public static void main(String[] args) throws Exception {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in) );
//        ArrayList<Integer> list = new ArrayList<Integer>(20);
//
//        ArrayList<Integer> list1 = new ArrayList<Integer>();
//        ArrayList<Integer> list2 = new ArrayList<Integer>();
//        ArrayList<Integer> list3 = new ArrayList<Integer>();
//
//        while (true)
//        {
//            String s = reader.readLine();
//            if (s.isEmpty()) break;
//            int z = Integer.parseInt(s);
//            list.add(z);
//        }
//
//        for (int i = 0; i < list.size(); i++){
//
//            int x = list.get(i);
//
//            if (x % 3 == 0){
//                list1.add(x);
//            } else if (x % 2 == 0){
//                list2.add(x);
//            } else {
//                list3.add(x);
//            }
//        }
//    }
//
//    public static void printList(List<Integer> list, int[] list1, int[] list2, int[] list3) {
//
//        for (int i = 0; i < list1.length; i++){
//            System.out.println(list1.get(i));
//        }
//
//        for (int j = 0; j < list2.length; j++){
//            System.out.println(list2.get(j));
//        }
//
//        for (int h = 0; h < list3.length; h++){
//            System.out.println(list3.get(h));
//        }
//
//    }
//}

