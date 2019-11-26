package by.it.givi.lesson05;
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
        ArrayList<String> place = new ArrayList<>();
        place.add("ghqne");
        place.add("ghqed");
        place.add("ghqfggse");
        place.add("ghqgse");
        place.add("gsdghqe");
        System.out.println(place.size());
        for (int i = 0; i < place.size(); i++) {
            System.out.println(place.get(i));


        }
    }
}