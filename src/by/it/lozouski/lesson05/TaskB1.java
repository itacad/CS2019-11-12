package by.it.lozouski.lesson05;
/*
Создайте 5 различных строк в списке ArrayList:

1. Создайте список строк.
2. Добавьте в него 5 различных строк.
3. Выведите его размер на экран.
4. Используя цикл выведите его содержимое на экран, каждое значение с новой строки.

*/


import java.util.ArrayList;
import java.util.Scanner;

public class TaskB1 {
    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<>();
        str.add("string1");
        str.add("string2");
        str.add("string3");
        str.add("string4");
        str.add("string5");
        System.out.println(str.size());
        for (String s : str) {
            System.out.println(s);
        }
    }
}
