package by.it.lozouski.lesson03;

import java.util.Scanner;

/*
    Сумма цифр четырехзначного числа

    Реализуйте метод sumDigitsInNumber(int number).
    Метод на вход принимает целое четырехзначное число.
    Нужно посчитать сумму цифр этого числа, и вернуть эту сумму.

    Пример:
    Метод sumDigitsInNumber вызывается с параметром 5467.

    Пример вывода:
    22

    Требования:
    1. В методе sumDigitsInNumber не могут быть использованы никакие дополнительные классы.
    2. Метод sumDigitsInNumber(int) должен быть не приватным и статическим.
    3. Метод sumDigitsInNumber должен возвращать значение типа int.
    4. Метод sumDigitsInNumber не должен ничего выводить на экран.
    5. Метод sumDigitsInNumber должен правильно возвращать сумму всех цифр в числе number.
*/
public class TaskC2 {

    static int sumDigitsInNumber(int number) {
        //через цикл for
//        int sum = 0;
//        for (; number > 0; number /= 10) {
//            sum = sum + (number % 10);
//        }
//        return sum;
//        -----------------
        //рекурсия
        if (number > 0) return sumDigitsInNumber(number / 10) + (number % 10);
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println(sumDigitsInNumber(sc1.nextInt()));
    }
}
