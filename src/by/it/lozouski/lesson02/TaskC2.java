package by.it.lozouski.lesson02;
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
        Scanner sc1 = new Scanner(System.in);
        int xDec = sc1.nextInt();
        int yDec = sc1.nextInt();
        convert(xDec,yDec,10);
        convert(xDec,yDec,2);
        convert(xDec,yDec,16);
        convert(xDec,yDec,8);
    }

    private static void convert(int x, int y, int s) {
        int sum = x + y;
        switch (s){
            case 2: System.out.println("BIN:"+Integer.toBinaryString(x)+"+"+Integer.toBinaryString(y)+"="+Integer.toBinaryString(sum)); break;
            case 16: System.out.println("HEX:"+Integer.toHexString(x)+"+"+Integer.toHexString(y)+"="+Integer.toHexString(sum)); break;
            case 8: System.out.println("OCT:"+Integer.toOctalString(x)+"+"+Integer.toOctalString(y)+"="+Integer.toOctalString(sum)); break;
            default: System.out.println("DEC:"+x+"+"+y+"="+sum);
        }
    }
}
