package by.it.lozouski.lesson04;

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

public class TaskC3 {
    public static void main(String[] args) {
        int size = 10;
        int x = 2;
        int y = 2;
        while (x <= size) {
            while (y <= size) {
                System.out.println(convertNumToStr(x) + " умножить на " + convertNumToStr(y) + " равно " + convertSumToStr(x,y));
                y++;
            }
            x++;
            y = 2;
        }
    }
    private static String convertNumToStr(int num){
        String convert = "";
        switch (num){
            case 1: convert = "один"; break;
            case 2: convert = "два"; break;
            case 3: convert = "три"; break;
            case 4: convert = "четыре"; break;
            case 5: convert = "пять"; break;
            case 6: convert = "шесть"; break;
            case 7: convert = "семь"; break;
            case 8: convert = "восемь"; break;
            case 9: convert = "девять"; break;
            case 10: convert = "десять"; break;
        }
        return convert;
    }
    private static String convertSumToStr(int x, int y){
        int temp = x * y;
        String convertsum = "";
        switch (temp){
            case 4: convertsum = "четыре"; break;
            case 6: convertsum = "шесть"; break;
            case 8: convertsum = "восемь"; break;
            case 9: convertsum = "девять"; break;
            case 10: convertsum = "десять"; break;
            case 12: convertsum = convertNumToStr(2).substring(0,2)+"енадцать"; break;
            case 14: convertsum = convertNumToStr(4).substring(0,5)+"надцать"; break;
            case 15: convertsum = convertNumToStr(5).substring(0,3)+"надцать"; break;
            case 16: convertsum = convertNumToStr(6).substring(0,4)+"надцать"; break;
            case 18: convertsum = convertNumToStr(8).substring(0,5)+"надцать"; break;
            case 20: convertsum = convertNumToStr(2)+"дцать"; break;
            case 21: convertsum = convertNumToStr(2)+"дцать "+convertNumToStr(1); break;
            case 24: convertsum = convertNumToStr(2)+"дцать "+convertNumToStr(4); break;
            case 25: convertsum = convertNumToStr(2)+"дцать "+convertNumToStr(5); break;
            case 27: convertsum = convertNumToStr(2)+"дцать "+convertNumToStr(7); break;
            case 28: convertsum = convertNumToStr(2)+"дцать "+convertNumToStr(8); break;
            case 30: convertsum = convertNumToStr(3)+"дцать "; break;
            case 32: convertsum = convertNumToStr(3)+"дцать "+convertNumToStr(2); break;
            case 35: convertsum = convertNumToStr(3)+"дцать "+convertNumToStr(5); break;
            case 36: convertsum = convertNumToStr(3)+"дцать "+convertNumToStr(6); break;
            case 40: convertsum = "сорок"; break;
            case 42: convertsum = "сорок "+convertNumToStr(2); break;
            case 45: convertsum = "сорок "+convertNumToStr(5); break;
            case 48: convertsum = "сорок "+convertNumToStr(8); break;
            case 49: convertsum = "сорок "+convertNumToStr(9); break;
            case 50: convertsum = convertNumToStr(5)+"десят"; break;
            case 54: convertsum = convertNumToStr(5)+"десят "+convertNumToStr(4); break;
            case 56: convertsum = convertNumToStr(5)+"десят "+convertNumToStr(6); break;
            case 60: convertsum = convertNumToStr(6)+"десят "; break;
            case 63: convertsum = convertNumToStr(6)+"десят "+convertNumToStr(3); break;
            case 64: convertsum = convertNumToStr(6)+"десят "+convertNumToStr(4); break;
            case 70: convertsum = convertNumToStr(7)+"десят "; break;
            case 72: convertsum = convertNumToStr(7)+"десят "+convertNumToStr(2); break;
            case 80: convertsum = convertNumToStr(8)+"десят"; break;
            case 81: convertsum = convertNumToStr(8)+"десят "+convertNumToStr(1); break;
            case 90: convertsum = convertNumToStr(9).substring(0,4)+"носто"; break;
            case 100: convertsum = "сто"; break;
        }
        return convertsum;
    }
}
