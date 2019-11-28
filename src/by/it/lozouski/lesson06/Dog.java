package by.it.lozouski.lesson06;

class Dog {
    private String name;
    private int age;

    public Dog() {
    }

    public Dog(String name, int i) {
        this.name=name;
        this.age=i;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Кличка: "+name+". Возраст: "+age;
    }
}
