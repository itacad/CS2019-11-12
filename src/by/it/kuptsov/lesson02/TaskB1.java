package by.it.kuptsov.lesson02;

/*
Выводим квадрат числа
Напишите программу, которая считывает с клавиатуры целое число a и выводит квадрат этого числа (a * a).
Для считывания данных с клавиатуры используйте метод nextInt() объекта класса Scanner.

Создать Scanner можно так:
Scanner sc=new Scanner(System.in);

Прочитать число можно так:
int i=sc.nextInt();

Требования:
1. Программа должна выводить текст.
2. В программе необходимо создать объект типа Scanner.
3. Программа должна считывать число типа Int с клавиатуры.
4. Программа должна выводить квадрат считанного числа.

 */

import java.util.Scanner;

class TaskB1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число:");
        int number = scanner.nextInt();
        System.out.println ("Вы ввели число " + number);
        int number2 = number * number;
        System.out.println ("Ваше число в квадрате будет " + number2);
    }
}
