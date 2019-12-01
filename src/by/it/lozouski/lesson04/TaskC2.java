package by.it.lozouski.lesson04;

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
        Scanner sc1 = new Scanner(System.in);
        int day = sc1.nextInt();
        int month = sc1.nextInt();
        int numDay = 0;
        for (int i = 0; i < month; i++) {
            if(month <= 1){ break; }
            else{ numDay += sumday(i); }
        }
        System.out.println((numDay+day));
    }

    private static int sumday(int t){
        int temp = 0;
        switch (t){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12: temp = 31; break;
            case 2: temp = 28; break;
            case 4: case 6: case 9: case 11: temp = 30; break;
        }
        return temp;
    }
}
