package by.it.givi.lesson02;

import java.util.Scanner;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и выводит их сумму на экран в виде

Ввод (это вы вводите с клавиатуры):
34 26

Вывод (это должна появится в консоли, обратите внимание на пробелы и слово Sum:
Sum = 60

*/
class TaskC1 {
    public static void main(String[] args) {
        Scanner O = new Scanner(System.in);
        int q = O.nextInt();
        int e = O.nextInt();
        int r = q + e;
        System.out.println("Sum " + "= " + r);
    }
}
