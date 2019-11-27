package by.it.popkov.my;

import java.util.Arrays;
import java.util.Scanner;

public class TaskB2b {
    public static void main(String[] args) {
        int [] big = new int[5];
        Scanner scanner = new Scanner(System.in);
        for (int i : big) {
            big[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(big));
    }
}
