package by.it.avlasevich.lesson04;

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
    Scanner sc = new Scanner(System.in);
    int day = sc.nextInt();
    int month = sc.nextInt();
    int days = 0;
    for (int i = 1; i < month; i++) {
      days = days + daysInMonth(i);
    }
    System.out.println(days + day);
  }

  public static int daysInMonth(int month) {
    switch (month) {
      case 1:
        return 31;
      case 2:
        return 28;
      case 3:
        return 31;
      case 4:
        return 30;
      case 5:
        return 31;
      case 6:
        return 30;
      case 7:
        return 31;
      case 8:
        return 31;
      case 9:
        return 30;
      case 10:
        return 31;
      case 11:
        return 30;
      case 12:
        return 31;
    }
    return 0;
  }
}
