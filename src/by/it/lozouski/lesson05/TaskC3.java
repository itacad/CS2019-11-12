package by.it.lozouski.lesson05;

/* Задачка на сортировку2
Задача: Написать программу, которая вводит с клавиатуры 20 чисел
и выводит их в убывающем порядке. Скорость O(n log n)
*/

import java.util.Scanner;

public class TaskC3 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        //Создание массива и заполнение его значениями
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc1.nextInt();
        }
        //Вызов метода сортировки
        quickSort(array, 0, array.length - 1);
        //Вывод на экран элементов массива
        for (int index : array) {
            System.out.println(index);
        }
    }

    // функция сортировки
    // Принимает параметры: массив(int[] arr), и начальный(from) и конечный(to) элемент каждого разбитого подмассива
    private static void quickSort(int[] arr, int from, int to) {

        if (from < to) { //  <=== проверка есть ли что сортировать в массиве
            int divIndex = partition(arr, from, to); //возвращает тот элемент массива, на котором произошло его разделение.
            // в методе partition происходит разделение массива на 2 подмассива
            // далее функция рекурсивно вызывается для полученых подмассивов
            quickSort(arr, from, divIndex - 1); //  <=== границы каждого нового подмассива от начала, до элемента divIndex не включ. его
            quickSort(arr, divIndex, to); //  <=== границы каждого нового подмассива от элемента divIndex до конца массива.
            //Массивы делятся до тех пор, пока не останется что делить.
        }
    }

    private static int partition(int[] arr, int from, int to) {
        // две переменные индексов массива - начало и конец( левый индекс и правый индекс )
        int rightIndex = to;
        int leftIndex = from;

        int pivot = arr[from + (to - from) / 2]; // создание опорного элемента массива, выбираем как середину массива.
        while (leftIndex <= rightIndex) {
            //Начинаем движение от начала массива к концу, пока не найдем элемент, который будет меньше опорного
            while (arr[leftIndex] > pivot) {
                leftIndex++;
            }//Условие выполняется и начинает двигаться правая часть от конца в начало, пока не найдем эл-т который будет больше опорного
            while (arr[rightIndex] < pivot) {
                rightIndex--;
            }
            // после того как найдена пара таких элементов, меняем их местами в методе swap();
            if (leftIndex <= rightIndex) {
                swap(arr, rightIndex, leftIndex);
                leftIndex++;
                rightIndex--;
            }
        }
        // если такого элемента не находим, то деление масиива происходит по элементу, для которого не нашли пару.
        return leftIndex;
    }
//  Обмен двух найденых элементов массива местами.
    private static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
