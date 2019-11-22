package by.it.popkov.lesson04;

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
        int day = scanner.nextInt();
        int month = scanner.nextInt();
        int numberOfMonth = 0;
        switch (month){
            case 1: numberOfMonth = 0; break;
            case 2: numberOfMonth = 31; break;
            case 3: numberOfMonth = 59; break;
            case 4: numberOfMonth = 90; break;
            case 5: numberOfMonth = 120; break;
            case 6: numberOfMonth = 151; break;
            case 7: numberOfMonth = 181; break;
            case 8: numberOfMonth = 212; break;
            case 9: numberOfMonth = 243; break;
            case 10: numberOfMonth = 273; break;
            case 11: numberOfMonth = 304; break;
            case 12: numberOfMonth = 334; break;
            default: System.out.println("Такого месяца не существует");
        }
        System.out.println(numberOfMonth+day);
    }

}
