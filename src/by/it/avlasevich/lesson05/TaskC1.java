package by.it.avlasevich.lesson05;
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

  public static void main(String[] args) throws Exception {
    ArrayList<Integer> m = new ArrayList<>(20);
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> a = new ArrayList<>();
    ArrayList<Integer> b = new ArrayList<>();
    ArrayList<Integer> c = new ArrayList<>();
    for (int i = 0; i < 20; i++) {
      m.add(sc.nextInt());
    }
    for (Integer q : m){
      if (q % 3 == 0) {
        a.add(q);
      }
      if (q % 2 == 0) {
        b.add(q);
      }
      if ((q % 2 != 0) & (q % 3 != 0)){
        c.add(q);
      }
    }
    printList(a);
    printList(b);
    printList(c);

  }
  private static void printList(List<Integer> list) {
    for (Integer q : list) {
      System.out.println(q);
    }
  }
}

