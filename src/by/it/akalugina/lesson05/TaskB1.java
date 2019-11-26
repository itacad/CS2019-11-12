package by.it.akalugina.lesson05;
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
        ArrayList<String> list=new ArrayList<>();
        list.add(0,"I");
        list.add(1,"am");
        list.add(2,"learning");
        list.add(3,"computer");
        list.add(4,"science");
        System.out.println(list.size());
        for(int i=0;i<list.size();i++){
            String s=list.get(i);
            System.out.println(s);
        }
    }
}
