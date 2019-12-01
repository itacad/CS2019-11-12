package by.it.popkov.lesson03;

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
        int first = number / 1000;
        int second = number / 100 - first * 10;
        int third = number / 10 - first * 100 - second * 10;
        int fourth = number - first * 1000 - second * 100 - third * 10;
        return first + second + third + fourth;
    }


    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(5467));
    }

}
