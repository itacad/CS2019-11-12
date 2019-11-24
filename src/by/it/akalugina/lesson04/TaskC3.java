package by.it.akalugina.lesson04;

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
import java.util.Locale;
public class TaskC3 {
    public static void main(String[] args) {
        String one = "один";
        String two = "два";
        String three = "три";
        String four = "четыре";
        String five = "пять";
        String six = "шесть";
        String seven = "семь";
        String eight = "восемь";
        String nine = "десять";
        String multiply = "умножить на";
        String equals = "равно";
        int power = 1;
        String fin;
        while (power <= 10) {
            fin = " ";
            int number = 1;
            while (number <= 10) {
                int answer = number * power;
                fin += (answer + " ");
                number++;
            }
            System.out.println(fin);
            power++;
        }
    }
}
