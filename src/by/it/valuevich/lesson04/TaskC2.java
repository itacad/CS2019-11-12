package by.it.valuevich.lesson04;

import java.util.Calendar;
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
    static void printDays (int days, int month) {
        Calendar c = Calendar.getInstance();
        c.set(2018, month - 1, days, 0, 0, 1);
        long current = c.getTimeInMillis();
        c.set(2018, Calendar.JANUARY, 1, 0, 0, 1);
        long start = c.getTimeInMillis();
        long res = ((current-start) / (1000L * 24 * 60 * 60)+1);
        System.out.println(res);

    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int d=scanner.nextInt();
        int m=scanner.nextInt();

        printDays(d, m);
    }

}
