package by.it.lozouski.lesson04;
/*
Существует ли пара?
Ввести с клавиатуры три целых числа.
Определить, имеется ли среди них хотя бы одна пара равных между собой чисел.
Если такая пара существует, вывести на экран числа через пробел.
Если все три числа равны между собой, то вывести все три.

Требования:
1. Программа должна считывать числа c клавиатуры.
2. Программа должна содержать System.out.println() или System.out.print()
3. Если два числа равны между собой, необходимо вывести числа на экран.
4. Если все три числа равны между собой, необходимо вывести все три.
5. Если нет равных чисел, ничего не выводить.

Пример для чисел 1 2 2:
2 2

Пример для чисел 2 2 2:
2 2 2

 */


import java.util.Scanner;

public class TaskA3 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int x = sc1.nextInt();
        int y = sc1.nextInt();
        int z = sc1.nextInt();
        if (x == y && y == z) {
            System.out.println();
        }
         else if (x == z) {
            System.out.println();
        } else if (y == z) {
            System.out.println();
        } else if (x == y) {
            System.out.println();
        }
    }
}
