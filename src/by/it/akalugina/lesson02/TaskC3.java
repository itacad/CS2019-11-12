package by.it.akalugina.lesson02;

/*
Ускорение свободного падения на Земле и Марсе таково:
Марс   3.86
Земля   9.81

С клавиатуры вводится вес человека в килограммах.
Рассчитайте вес человека на Марсе и выведите
округлив его до сотых килограмма (2 знака)

Создайте для этих целей метод getWeight(int weight)

Требования:
1. Метод getWeight(int weight) должен быть статическим.
2. Метод getWeight должен возвращать значение типа double.
3. Метод getWeight должен обязательно (!) округлять до сотых возвращаемое значение типа double.
4. Метод getWeight не должен ничего выводить на экран.
5. Метод getWeight должен правильно переводить вес тела в килограммах на Земле
    в вес этого же тела на Марсе, и возвращать это значение.

Пример:

Ввод:
75

Вывод:
29.51


*/

import java.util.Scanner;


class TaskC3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int weight = in.nextInt();
        System.out.println(getWeight(weight));
    }

     static double getWeight(int weight) {
        double v = 9.81;
        double planet = weight / v;
        double n = 3.86;
        double mars = planet * n;
        double marsround = Math.round(mars * 100.0) / 100.0;
        return marsround;

    }
}

