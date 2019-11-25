package by.it.zenevich.lesson04;

/*
Вывести таблицу умножения 10 x 10 (двоныйм циклом),
но вывод должен быть словами:

Ожидаемый вывод:
два умножить на два равно четыре
два умножить на три равно шесть
два умножить на четыре равно восемь
два умножить на пять равно десять
два умножить на шесть равно двенадцать
два умножить на семь равно четырнадцать
два умножить на восемь равно шестнадцать
два умножить на девять равно восемнадцать
два умножить на десять равно двадцать
три умножить на два равно шесть
три умножить на три равно девять
три умножить на четыре равно двенадцать
...
и т.д. до фразы
...
десять умножить на десять равно сто
*/

import java.util.Scanner;

public class TaskC3 {
    public static class NumberWriter {

        public static final String[] BELOW_TWENTY = {"ноль", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять", "десять", "одинадцать", "двенадцадь", "тринадцать", "четырнадцать", "пятнадцать", "шестнадцать", "семнадцать", "восемнадцать", "девятнадцать"};
        public static final String[] TENS = {"сто", "десять", "двадцать", "тридцать", "сорок", "пятьдесят", "шестьдесят", "семьдесят", "восемьдесят", "девяносто"};

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int size = scanner.nextInt();
            int x = 1;
            while (x <= size) {
                int y = 2;
                while (y <= size) {
                    int z = x * y;
                    if (z < 20)
                        System.out.println(BELOW_TWENTY[x] + " умножить на " + BELOW_TWENTY[y] + " равно " + BELOW_TWENTY[z]);
                    else if (z < 100) {
                        int high = z / 10;
                        int low = z % 10;
                        String text = TENS[high];
                        if (low != 0) {
                            System.out.println(BELOW_TWENTY[x] + " умножить на " + BELOW_TWENTY[y] + " равно " + text + " " + BELOW_TWENTY[low]);
                        } else System.out.println(BELOW_TWENTY[x] + " умножить на " + BELOW_TWENTY[y] + " равно " + text);
                    } else
                        System.out.println(BELOW_TWENTY[x] + " умножить на " + BELOW_TWENTY[y] + " равно " + TENS[0]);
                    y++;
                }
                x++;
            }
        }
    }
}
