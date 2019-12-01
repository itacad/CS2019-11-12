package by.it.akalugina.lesson05;

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

import java.util.Scanner;

public class TaskB3 {
    public static void main(String[] args) {
        int[] m=new int[10];
        int d;
        int h;
        int a,b,c;
        int size;
        size=10;
        d=h=m[0];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < m.length; i++) {
            m[i]=scanner.nextInt();
            if(i<1){
            d=m[i];
            }
            if(i>8){
            h=m[i];
            }
        }
        for(a=1;a<size;a++)
            for(b=size-1;b>=a;b--){
                if(m[b-1]>m[b]){
                    c=m[b-1];
                    m[b-1]=m[b];
                    m[b]=c;
                }
            }
        for(int i=0;i<10;i++) {
            if(m[i]==d){
                System.out.println("Index of first element="+i);
            }
            if(m[i]==h){
                System.out.println("Index of last element="+i);
            }
        }
    }
}