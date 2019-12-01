package by.it.tarasevich.lesson05;
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
        ArrayList<String> word = new ArrayList<>();
        word.add("one");
        word.add("two");
        word.add("three");
        word.add("four");
        word.add("five");
        System.out.println(word.size());
        for (String element : word){
            System.out.println(element);
        }
    }
}

