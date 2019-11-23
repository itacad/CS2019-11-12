package by.it.popkov.lesson04;

/*
Вывести таблицу умножения 10 x 10 (двоныйм циклом),
но вывод должен быть словами:

Ожидаемый вывод:
два умножить на два равно четыре
два умножить на три равно шесть
два умножить на четыре равно восемь
два умножить на пять равно десять
два умножить на шесть равно двенадцать
два умножить на семь равно четырнадцать
два умножить на восемь равно шестнадцать
два умножить на девять равно восемнадцать
два умножить на десять равно двадцать
три умножить на два равно шесть
три умножить на три равно девять
три умножить на четыре равно двенадцать
...
и т.д. до фразы
...
десять умножить на десять равно сто
*/

import java.util.Scanner;

public class TaskC3 {
    static String numToString(int num){
        String textNum = "";
        if (num >= 0 && num < 20){
            switch (num){
                case 0: textNum = "ноль"; break;
                case 1: textNum = "один"; break;
                case 2: textNum = "два"; break;
                case 3: textNum = "три"; break;
                case 4: textNum = "четыре"; break;
                case 5: textNum = "пять"; break;
                case 6: textNum = "шесть"; break;
                case 7: textNum = "семь"; break;
                case 8: textNum = "восемь"; break;
                case 9: textNum = "девять"; break;
                case 10: textNum = "десять"; break;
                case 11: textNum = "одинадцать"; break;
                case 12: textNum = "двенадцать"; break;
                case 13: textNum = "тринадцать"; break;
                case 14: textNum = "четырнадцать"; break;
                case 15: textNum = "пятнадцать"; break;
                case 16: textNum = "шестнадцать"; break;
                case 17: textNum = "семнадцать"; break;
                case 18: textNum = "восемнадцать"; break;
                case 19: textNum = "девятнадцать"; break;
            }

        }
        else if (num >=20 && num < 40){
            if (num != 20 && num != 30){
            textNum = numToString(num / 10) + "дцать " + numToString(num - ((num/10)*10));
            }
            else {
                textNum = numToString(num / 10) + "дцать";
            }
        }
        else if (num >=40 && num < 50){
            if (num != 40){
            textNum = "сорок " + numToString(num - ((num/10)*10));
            }
            else {
                textNum = "сорок";
            }
        }
        else if (num >=50 && num < 90){
            if (num != 50 && num != 60 && num != 70 && num != 80){
            textNum = numToString(num / 10) + "десят " + numToString(num - ((num/10)*10));
            }
            else {
                textNum = numToString(num / 10) + "десят";
            }
        }
        else if (num >=90 && num < 100){
            if (num != 90){
                textNum = "девяносто " + numToString(num - ((num/10)*10));
            }
            else {
                textNum = "девяносто";
            }
        }
        else if (num == 100){
            textNum = "сто";
        }
        else {
            textNum = "Недопустимое значение";
        }
        return textNum;
    }
    public static void main(String[] args) {
        for (int firstMult = 2; firstMult <= 10; firstMult++) {
            for (int secondMult = 2; secondMult <= 10; secondMult++) {
                System.out.println(numToString(firstMult) + " умножить на " + numToString(secondMult) + " равно " + numToString(firstMult * secondMult));
            }
        }
    }

}
