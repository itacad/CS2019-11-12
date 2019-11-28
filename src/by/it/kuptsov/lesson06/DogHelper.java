package by.it.kuptsov.lesson06;

public class DogHelper {
    static void printAllNames(Dog[] dogs){
        for (Dog dog : dogs) {
            System.out.println(dog.getName()+" ");
        }
        System.out.println();
    }

   static double averageAge(Dog[] dogs) {
        double sum=0;
        for (Dog dog : dogs) {
            sum+=dog.getAge();
        }
        return sum/dogs.length;
    }

}
