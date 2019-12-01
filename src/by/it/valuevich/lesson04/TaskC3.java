package by.it.valuevich.lesson04;

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
    static String cypherToString(int cypher) {
        String[][] w = {
                {"", "один ", "два ", "три ", "четыре ", "пять ", "шесть ", "семь ", "восемь ", "девять ",
                        "десять ", "одиннадцать ", "двенадцать ", "тринадцать ", "четырнадцать ", "пятнадцать ",
                        "шестнадцать ", "семнадцать ", "восемнадцать ", "девятнадцать ", ""},

                {"", "", "двадцать ", "тридцать ", "сорок ", "пятьдесят ", "шестьдесят ", "семьдесят ", "восемьдесят ", "девяносто "},
                {"", "сто ", "двести ", "триста ", "четырста ", "пятьсот ", "шестьсот ", "семьсот ", "восемьсот ", "девятьсот "}
        };
        int i2 = cypher / 100;
        cypher = cypher - i2 * 100;
        int i1 = cypher / 10;
        cypher = cypher - i1 * 10;
        int i0 = i1 < 2 ? cypher + i1 * 10 : cypher;
        return w[2][i2] + w[1][i1] + w[0][i0];
    }


    public static void main(String[] args) {
        for (int i = 2; i <= 10; i++) {
            for (int j = 2; j <= 10; j++) {

                System.out.println(cypherToString(i) + "умножить на " + cypherToString(j) + "равно " + cypherToString(i * j));
            }
        }
    }
}

//    static String cypherToString(int cypher) {
//
//        if(cypher<19 && cypher >=0){
//            switch(cypher){
//                case 0: return "ноль";
//                case 1: return "один";
//                case 2: return "два";
//                case 3: return "три";
//                case 4: return "четыре";
//                case 5: return "пять";
//                case 6: return "шесть";
//                case 7: return "семь";
//                case 8: return "восемь";
//                case 9: return "девять";
//                case 10: return "десять";
//                case 11: return "одинадцать";
//                case 12: return "двенадцать";
//                case 13: return "тринадцать";
//                case 14: return "четырнадцать";
//                case 15: return "пятнадцать";
//                case 16: return "шестнадцать";
//                case 17: return "семнадцать";
//                case 18: return "восемнадцать";
//                case 19: return "девятнадцать";
//
//            }
//            int d=cypher/10;
//            String added=((cypher%10)!==0)?""+cypherToString(cypher%10):"";
//            switch (cypher/10){
//                case 2: return "двадцать"+added;
//                case 3: return "тридцать"+added;
//                case 4: return "сорок"+added;
//                case 5: return "пятьдесят"+added;
//                case 6: return "шестьдесят"+added;
//                case 7: return "семьдесят"+added;
//                case 8: return "восемьдесят"+added;
//                case 9: return "девяносто"+added;
//                case 10: return "сто"+added;
//
//            }
//            return "что-то очень большое"
//        }