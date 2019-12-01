package by.it.givi.lesson04;

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
        Scanner scan = new Scanner(System.in);
        int day = scan.nextInt();
        int month = scan.nextInt();
        int mDay = 0;
        for (int i = 0; i < month; i++) {
            if(month <= 1){ break; }
            else{ mDay += allday(i); }
        }
        System.out.println((mDay+day));
    }

    private static int allday(int t){
        int s = 0;
        switch (t){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12: s = 31; break;
            case 2: s = 28; break;
            case 4: case 6: case 9: case 11: s = 30; break;
        }
        return s;
    }
}

