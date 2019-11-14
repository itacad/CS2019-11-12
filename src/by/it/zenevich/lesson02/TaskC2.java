package by.it.zenevich.lesson02;

import java.util.Arrays;
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
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int s = x + y;
        System.out.println("DEC:" + x + "+" + y + "=" + s);
        System.out.println("BIN:" + Integer.toString(x,2) + "+" + Integer.toString(y,2) + "=" + Integer.toString(s,2));
        System.out.println("HEX:" + Integer.toString(x,16) + "+" + Integer.toString(y,16) + "=" + Integer.toString(s,16));
        System.out.println("OCT:" + Integer.toString(x,8) + "+" + Integer.toString(y,8) + "=" + Integer.toString(s,8));
    }

}
