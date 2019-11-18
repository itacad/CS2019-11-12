package by.it.akalugina.lesson02;

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
import java.util.Scanner;

class TaskC2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = a + b;
        String abin = Integer.toBinaryString(a);
        String ahex = Integer.toHexString(a);
        String aoct = Integer.toOctalString(a);
        String bbin = Integer.toBinaryString(b);
        String bhex = Integer.toHexString(b);
        String boct = Integer.toOctalString(b);
        String cbin = Integer.toBinaryString(c);
        String chex = Integer.toHexString(c);
        String coct = Integer.toOctalString(c);
        System.out.println("DEC" + ":" + a + "+" + b + "="+c);
        System.out.println("BIN" + ":" + abin + "+" + bbin + "="+cbin);
        System.out.println("HEX" + ":" + ahex + "+" + bhex + "="+chex);
        System.out.println("OCT" + ":" + aoct + "+" + boct + "="+coct);
    }

}
