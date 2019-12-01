package by.it.avlasevich.lesson05;
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
    ArrayList<String> a = new ArrayList<>();
    a.add("Мой дядя самых честных правил,");
    a.add("Когда не в шутку занемог,");
    a.add("Он уважать себя заставил");
    a.add("И лучше выдумать не мог,");
    a.add("Его пример другим наука;");
    int m = a.size();
    System.out.println(m);
    for (int i = 0; i < a.size(); i++) {
      int k = a.size() - i - 1;
      System.out.println(a.get(k));
    }
  }
}

