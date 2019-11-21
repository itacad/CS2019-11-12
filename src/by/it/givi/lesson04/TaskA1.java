package by.it.givi.lesson04;

import java.util.Scanner;

/*
Выведите на экран в цикле 10 раз фразу
Я изучаю программирование.

при  выводе сделайте такое разветвление в теле цикла,
чтобы вместо 3-й и 9-й по счету фраз выводилась фраза
Меня интересует высокая зарплата!

Должнен получиться следующий вывод строк:

Я изучаю программирование.
Я изучаю программирование.
Меня интересует высокая зарплата!
Я изучаю программирование.
Я изучаю программирование.
Я изучаю программирование.
Я изучаю программирование.
Я изучаю программирование.
Меня интересует высокая зарплата!
Я изучаю программирование.



 */
public class TaskA1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        switch (day){
            case 1: System.out.println("понедельник"); break;
            case 2: System.out.println("вторник"); break;
            case 3: System.out.println("среда"); break;
            case 4: System.out.println("четверг"); break;
            case 5: System.out.println("пятница"); break;
            case 6: System.out.println("суббота"); break;
            case 7: System.out.println("воскресенье"); break;
            default:System.out.println("такого дня недели не существует");
        }

    }

}




