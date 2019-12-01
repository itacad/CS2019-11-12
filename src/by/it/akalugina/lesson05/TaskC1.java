package by.it.akalugina.lesson05;
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
    public static void main(String[] args) throws Exception
    {
        ArrayList<Integer>list=new ArrayList<>();
        ArrayList<Integer>first=new ArrayList<>();
        ArrayList<Integer>second=new ArrayList<>();
        ArrayList<Integer>third=new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        for(int i=0;i<20;i++){
            list.add(i, scanner.nextInt());
            if(list.get(i)%3==0){
                first.add(list.get(i));

            }
            if(list.get(i)%2==0) {
                second.add(list.get(i));
            }
            if(list.get(i)%2!=0&&list.get(i)%3!=0){
                third.add(list.get(i));
            }
        }

        for(int i=0;i<first.size();i++){
            int j=first.get(i);
            System.out.println(j);
        }
        for(int i=0;i<second.size();i++){
            int j=second.get(i);
            System.out.println(j);
        }
        for(int i=0;i<third.size();i++) {
            int j = third.get(i);
            System.out.println(j);
        }

    }

    private static void printList(List<Integer> list) {
        for (Integer aList : list) System.out.println(aList);
    }


}
