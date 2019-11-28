package by.it.akalugina.lesson05;

/* Задачка на сортировку2
Задача: Написать программу, которая вводит с клавиатуры 20 чисел
и выводит их в убывающем порядке. Скорость O(n log n)
*/

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class TaskC3 {
    //Напишите тут ваш код
    public static void main(String[] args) {
        int[] list;
        list = new int[20];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        int[] result = sort(list);
        
        Integer[] resultint = new Integer[result.length];

        for (int i = 0; i < result.length; i++) {
            resultint[i] = result[i];
        }
        Arrays.sort(resultint, Collections.reverseOrder());

        for(int i=0;i<resultint.length;i++){
            System.out.println(resultint[i]);
        }
    }
    public static int[] sort(int[] list) {
        int[] buffer1 = Arrays.copyOf(list, list.length);
        int[] buffer2 = new int[list.length];
        int[] result = mergesortInner(buffer1, buffer2, 0, list.length);
        return result;
    }
    public static int[] mergesortInner(int[] buffer1, int[] buffer2,
                                       int startIndex, int endIndex) {
        if (startIndex >= endIndex - 1) {
            return buffer1;
        }
        int middle = startIndex + (endIndex - startIndex) / 2;
        int[] sorted1 = mergesortInner(buffer1, buffer2, startIndex, middle);
        int[] sorted2 = mergesortInner(buffer1, buffer2, middle, endIndex);

        int index1 = startIndex;
        int index2 = middle;
        int destIndex = startIndex;
        int[] result = sorted1 == buffer1 ? buffer2 : buffer1;
        while (index1 < middle && index2 < endIndex) {
            result[destIndex++] = sorted1[index1] < sorted2[index2]
                    ? sorted1[index1++] : sorted2[index2++];
        }
        while (index1 < middle) {
            result[destIndex++] = sorted1[index1++];
        }
        while (index2 < endIndex) {
            result[destIndex++] = sorted2[index2++];
        }
        return result;
    }
}