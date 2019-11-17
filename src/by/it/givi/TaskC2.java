package by.it.givi;

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
        Scanner O = new Scanner(System.in);
        int q = O.nextInt();
        int e = O.nextInt();
        int r =  q + e;
        System.out.println("DEC:" + q + "+" + e + "=" +r);
        System.out.println("BIN:" + Integer.toBinaryString(q) + "+" + Integer.toBinaryString(e) + "="
        + Integer.toBinaryString(r));
        System.out.println("HEX:" + Integer.toHexString(q) + "+" + Integer.toHexString(e) + "=" + Integer.toHexString(r));
        System.out.println("OCT:" + Integer.toOctalString(q) + "+" + Integer.toOctalString(e) + "=" + Integer.toOctalString(r));
    }
}


