package by.it.givi.lesson02;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
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
/*
class TaskC3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        double e = 9.81;
        double m = 3.86;
        double d = i * m / e;
        double c = Math.round(d*100.0)/100.0;
        System.out.println(c);
    }
}
/*
class TaskC4 {
    public static void main(String[] args) {
        System.out.println(getWeight(888));
    }
        public static double getWeight(int earthWeight) {
            double e = 9.81;
            double m = 3.86;
            double d = i * m / e;
            double c = Math.round(d*100.0)/100.0;
            return c;
        }
}
*/
class TaskC3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int weight = sc.nextInt();
        System.out.println(getWeight(weight));
    }

    private static double getWeight(int weight) {
        double gMars = 3.86;
        double gEarth = 9.81;
        double roundWeight = weight * (gMars / gEarth);
        return new BigDecimal(roundWeight).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

}


