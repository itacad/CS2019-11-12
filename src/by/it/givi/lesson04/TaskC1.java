package by.it.givi.lesson04;

import java.util.Scanner;

/*
Напишите программу которая спрашивает у пользователя:
Какую вы хотите зарплату в $$$?

После ввода суммы, программа анализирует полученное значение
и если введенная цифра меньше 300 или больше 3000 программа выводит на экран:
Мы вам перезвоним!

Иначе выводит в цикле по переменной int month от 0 до 14 рассчитанную зарплату.
В летние месяцы - выводится введенная сумма с названием месяца.
В несуществующие месяцы 0, 13 и 14 выводится сумма в $0.0
в остальные месяцы выводится указанная сумма с премией в 50%.

Сделайте так, чтобы в тот месяц, когда получилась зарплата в $666 цикл после вывода прерывался.

Пример работы программы (у вас должно быть так же, до символа):

Какую вы хотите зарплату в $$$?
2000
За месяц 0 начислено $0.0
За январь начислено $3000.0
За февраль начислено $3000.0
За март начислено $3000.0
За апрель начислено $3000.0
За май начислено $3000.0
За июнь начислено $2000.0
За июль начислено $2000.0
За август начислено $2000.0
За сентябрь начислено $3000.0
За октябрь начислено $3000.0
За ноябрь начислено $3000.0
За декабрь начислено $3000.0
За месяц 13 начислено $0.0
За месяц 14 начислено $0.0

*/
public class TaskC1 {
    public static void main(String[] args) {
        System.out.println("Какую вы хотите зарплату в $$$?");
        Scanner sc = new Scanner(System.in);
        int salary = sc.nextInt();
        int month = 0;
        if (300 > salary || salary > 3000) {
            System.out.print("Мы вам перезвоним!");
        } else {
            for (; month <= 14; month++) {
                System.out.println(MonthNumber(month) + salarycount(month, salary));
                if (salarycount(month, salary) == 666) {
                    break;
                }
            }
        }
    }
    private static String MonthNumber(int month) {
        String m = String.valueOf(month);
        switch (month) {
            case 0: case 13: case 14: m = "За месяц "+month+" начислено $";break;
            case 1: m = "За январь начислено $";break;
            case 2: m = "За февраль начислено $";break;
            case 3: m = "За март начислено $";break;
            case 4: m = "За апрель начислено $";break;
            case 5: m = "За май начислено $";break;
            case 6: m = "За июнь начислено $";break;
            case 7: m = "За июль начислено $";break;
            case 8: m = "За август начислено $";break;
            case 9: m = "За сентябрь начислено $";break;
            case 10: m = "За октябрь начислено $";break;
            case 11: m = "За ноябрь начислено $";break;
            case 12: m = "За декабрь начислено $";break;
        }
        return m;
    }

    private static double salarycount(int month, int zp) {
        double calc = 0;
        if (month == 0 || month == 13 || month == 14) {
            return calc;
        } else if ((month > 0 && month < 6) || (month > 8 && month < 13)) {
            return zp + (zp * 0.5);
        } else return zp;
    }
}



