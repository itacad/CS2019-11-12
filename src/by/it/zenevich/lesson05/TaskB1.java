package by.it.zenevich.lesson05;
/*
Создайте 5 различных строк в списке ArrayList:

1. Создайте список строк.
2. Добавьте в него 5 различных строк.
3. Выведите его размер на экран.
4. Используя цикл выведите его содержимое на экран, каждое значение с новой строки.

*/


import java.util.ArrayList;
import java.util.Arrays;

public class TaskB1 {
    public static void main(String[] args) {
        ArrayList<String> lines = new ArrayList<>();
        lines.add("Первая строка");
        lines.add("Вторая строка");
        lines.add("Третья строка");
        lines.add("Четвертая строка");
        lines.add("Пятая строка");
        System.out.println(lines.size());
        for (String s : lines) {
            System.out.println(s);
        }
    }
}
