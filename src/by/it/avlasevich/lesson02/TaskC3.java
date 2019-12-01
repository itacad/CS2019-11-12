package by.it.avlasevich.lesson02;

import java.util.Scanner;

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
class TaskC3 {

  public static double getWeight(int weight) {
    double gEarth = 9.81;
    double gMars = 3.86;
    double weightMars = weight * gMars / gEarth;
    return Math.round(weightMars * 100) / 100.0;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int weight = sc.nextInt();
    System.out.println(getWeight(weight));
  }

}
