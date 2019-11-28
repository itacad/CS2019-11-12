package by.it.lozouski.lesson06;

class Dog {
    private String name;
    private int age;
    private int weight;
    private double power;

    Dog() {
    }

    Dog(String name, int i) {
        this.name = name;
        this.age = i;
    }

    Dog(String name, int age, int weight, double power) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    int getAge() {
        return age;
    }

    void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    boolean win(Dog otherDog) {
        double myWin = 0.2 * this.age + 0.3 * this.weight + 0.5 * this.power;
        double otherWin = 0.2 * otherDog.age + 0.3 * otherDog.weight + 0.5 * otherDog.power;
        return myWin > otherWin;
    }

    @Override
    public String toString() {
        return "Кличка: " + name + ". Возраст: " + age;
    }
}
