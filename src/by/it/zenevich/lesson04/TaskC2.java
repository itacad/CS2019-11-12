package by.it.zenevich.lesson04;

import java.time.LocalDate;
import java.util.*;

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
        int day = scanner.nextInt();
        int month = scanner.nextInt();
        if (day > 0 && month > 0) {
            LocalDate date = LocalDate.of(2018, month, day);
            int dayOfYear = date.getDayOfYear();
            System.out.println(dayOfYear);
        } else
            System.out.println(0);
    }

}
