package by.it.popkov.lesson04;

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
        Scanner scanner = new Scanner(System.in);
        int wantPay = scanner.nextInt();
        if (wantPay >= 300 && wantPay <= 3000) {
            for (int month = 0; month < 15; month++) {
                double multiplier = 0.0;
                String monthName = "";
                switch (month) {
                    case 0: multiplier = 0.0; monthName = "месяц 0"; break;
                    case 1: multiplier = 1.5; monthName = "январь"; break;
                    case 2: multiplier = 1.5; monthName = "февраль"; break;
                    case 3: multiplier = 1.5; monthName = "март"; break;
                    case 4: multiplier = 1.5; monthName = "апрель"; break;
                    case 5: multiplier = 1.5; monthName = "май"; break;
                    case 6: multiplier = 1.0; monthName = "июнь"; break;
                    case 7: multiplier = 1.0; monthName = "июль"; break;
                    case 8: multiplier = 1.0; monthName = "август"; break;
                    case 9: multiplier = 1.5; monthName = "сентябрь"; break;
                    case 10: multiplier = 1.5; monthName = "октябрь"; break;
                    case 11: multiplier = 1.5; monthName = "ноябрь"; break;
                    case 12: multiplier = 1.5; monthName = "декабрь"; break;
                    case 13: multiplier = 0.0; monthName = "месяц 13"; break;
                    case 14: multiplier = 0.0; monthName = "месяц 14"; break;
                    default: System.out.println("Какая то ошибка");
                }
                double pay = wantPay * multiplier;
                System.out.println("За " + monthName + " начислено $" + pay);
                if (pay == 666.00) break;
            }
        } else {
            System.out.println("Мы вам перезвоним!");
        }
    }

}
