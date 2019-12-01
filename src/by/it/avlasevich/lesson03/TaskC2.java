package by.it.avlasevich.lesson03;

import java.util.Scanner;

/*
    Сумма цифр четырехзначного числа

    Реализуйте метод c sumDigitsInNumber(number).
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
    public static int sumDigitsInNumber(int number){
        int n1 = number/1000;
        int n2 = (number - (n1 * 1000))/100;
        int n3 = (number - (n1 * 1000) - (n2 * 100))/10;
        int n4 = number - (n1 * 1000) - (n2 * 100) - (n3 * 10);
        int sum = n1 + n2 + n3 + n4;
        return sum;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum = sumDigitsInNumber(number);
        System.out.println(sum);

    }




//    public static void main(String[] args) {
//        System.out.println(sumDigitsInNumber(5467));
//    }

}
