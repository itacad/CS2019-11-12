package by.it.akalugina.lesson04;

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
import java.util.Scanner;

public class TaskC2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();
        int month=scanner.nextInt();
        if(month==1){
            System.out.println(day*month);
        }
        else if(month==2){
            System.out.println(31+day);
        }
        else if(month==3){
            System.out.println(28+31+day);
        }
        else if(month==4){
            System.out.println(31+28+31+day);
        }
        else if(month==5){
            System.out.println(31+28+31+30+day);
        }
        else if(month==6){
            System.out.println(31+28+31+30+31+day);
        }
        else if(month==7){
                System.out.println(31+28+31+30+31+30+day);
        }
        else if(month==8){
            System.out.println(31+28+31+30+31+30+31+day);
        }
        else if(month==9){
            System.out.println(31+28+31+30+31+30+31+31+day);
        }
        else if(month==10){
            System.out.println(31+28+31+30+31+30+31+31+30+day);
        }
        else if(month==11){
            System.out.println(31+28+31+30+31+30+31+31+30+31+day);
        }
        else if(month==12){
            System.out.println(31+28+31+30+31+30+31+31+30+31+30+day);
        }
    }

}
