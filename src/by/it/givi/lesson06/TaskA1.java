package by.it.givi.lesson06;

/*
Геттеры и сеттеры для класса Dog

Создайте class Dog.
У собаки должна быть кличка String name и возраст int age.
Создайте геттеры и сеттеры для всех переменных класса Dog.

        Требования:
        1. Программа не должна считывать данные с клавиатуры.
        2. У класса Dog должна быть переменная name с типом String.
        3. У класса Dog должна быть переменная age с типом int.
        4. У класса должен сеттер для переменной name.
        5. У класса должен геттер для переменной name.
        6. У класса должен сеттер для переменной age.
        7. У класса должен геттер для переменной age.
        8. Создайте внутри метода main (класса TaskA1) две разных собаки (т.е. два объекта типа Dog)
        9. Заполните поля собак используя сеттеры.
            Первая - Шарик, 5 лет. Вторая - Тузик, 3 года.
        10. Напечатайте этих двух собак, выводите собак в формате
            Кличка Возраст
            через пробел. При выводе обязательно иcпользуйте геттеры.

Ожидается вывод:
Шарик 5
Тузик 3
*/



public class TaskA1 {
    public static void main(String[] args) {
        Dog psi = new Dog();
        psi.setName("Шарик");
        psi.setAge(5);

        Dog pes = new Dog();
        pes.setName("Тузик");
        pes.setAge(3);
        System.out.println(psi.getName()+" "+psi.getAge());
        System.out.println(pes.getName()+" "+pes.getAge());
    }


}
