package by.it.avlasevich.lesson04;

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
    double money = sc.nextDouble();
    if ((money < 300) || (money > 3000)) {
      System.out.println("Мы вам перезвоним!");
      return;
    }
    for (int month = 0; month <= 14; month++) {
      double salary = salary(money, month);
      System.out.println("За " + monthName(month) + " начислено $" + salary);
      if (salary == 666) {
        break;
      }
    }
  }

  public static double salary(double money, int month) {
    double bonus;
    if (month < 1 || month > 12) {
      return 0;
    } else if (month >= 6 && month <= 8) {
      bonus = 0;
    } else {
      bonus = money * 0.5;
    }
    return bonus + money;
  }
public static String monthName(int month) {
    switch (month){
      case 1:
        return "январь";
      case 2:
        return "февраль";
      case 3:
        return "март";
      case 4:
        return "апрель";
      case 5:
        return "май";
      case 6:
        return "июнь";
      case 7:
        return "июль";
      case 8:
        return "август";
      case 9:
        return "сентябрь";
      case 10:
        return "октябрь";
      case 11:
        return "ноябрь";
      case 12:
        return "декабрь";
      default:
        return "месяц " + month;
    }
}

}
