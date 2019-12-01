package by.it.popkov.lesson05;
/*
Создайте 5 различных строк в списке ArrayList:

1. Создайте список строк.
2. Добавьте в него 5 различных строк.
3. Выведите его размер на экран.
4. Используя цикл выведите его содержимое на экран, каждое значение с новой строки.

*/


import java.util.ArrayList;


public class TaskB1 {
    public static void main(String[] args) {
        ArrayList<String> text = new ArrayList<>();
        text.add("One");
        text.add("Two");
        text.add("Three");
        text.add("Four");
        text.add("Five");
        System.out.println(text.size());
        for (String s : text) {
            System.out.println(s);
        }
    }

}
