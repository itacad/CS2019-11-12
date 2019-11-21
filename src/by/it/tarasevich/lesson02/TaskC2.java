package by.it.tarasevich.lesson02;

import java.util.Scanner;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и 4 раза выводит их сумму с обозначением системы счисления на экран в
ДЕСЯТИЧНОМ ДВОИЧНОМ ШЕСТНАДЦАТИРИЧНОМ ВОСЬМИРИЧНОМ виде

Вот пример ввода с клавиатуры:
34 26

Тогда вывод ожидается такой (обратите внимание на регистр букв):
DEC:34+26=60
BIN:100010+11010=111100
HEX:22+1a=3c
OCT:42+32=74
*/
class TaskC2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int i = scanner.nextInt();

    }

    /* Нужно написать программу, которая вводит два числа с клавиатуры
        и выводит их сумму на экран в виде

        Ввод (это вы вводите с клавиатуры):
        34 26

        Вывод (это должна появится в консоли, обратите внимание на пробелы и слово Sum:
        Sum = 60

        */
    static class TaskC1 {



        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            int i = scanner.nextInt();
            int sum = a + i;

            System.out.println("Sum = " + sum);


        }
    }
}
