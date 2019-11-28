package by.it.popkov.lesson06;

public class DogHelper {
    static void pringAllNames(Dog[] dogs){
        for (Dog dog : dogs) {
            System.out.print(dog.getName());
        }
        System.out.println();
    }
    static double averangeAge(Dog[] dogs){
        double sum = 0;
        for (Dog dog : dogs) {
            sum+=dog.getAge();
        }
        return sum/dogs.length;
    }
}
