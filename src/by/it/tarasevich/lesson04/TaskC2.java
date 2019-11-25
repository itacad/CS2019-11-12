package by.it.tarasevich.lesson04;

import java.util.Scanner;

/*

На входе вводится число и месяц 2018 года.
Программа должна выводить номер дня года, считая 1 января первым днем,
а 31 декабря 365-м.

Пример:
Ввод:
1 1

Вывод
1

Ввод:
31 12

Вывод
365

Ввод:
13 9

Вывод
256

 */
public class TaskC2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int d = scanner.nextInt();
        int month = scanner.nextInt();
        switch (month) {
            case 1:
                System.out.println(d);
                break;
            case 2:
                System.out.println(d + 31);
                break;
            case 3:
                System.out.println(d + 59);
                break;
            case 4:
                System.out.println(d + 90);
                break;
            case 5:
                System.out.println(d + 120);
                break;
            case 6:
                System.out.println(d + 151);
                break;
            case 7:
                System.out.println(d + 181);
                break;
            case 8:
                System.out.println(d + 212);
                break;
            case 9:
                System.out.println(d + 243);
                break;
            case 10:
                System.out.println(d + 273);
                break;
            case 11:
                System.out.println(d + 304);
                break;
            case 12:
                System.out.println(d + 334);
                break;
            default:
                System.out.println();
        }
    }
}
