package by.it.akalugina.lesson04;

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
import java.io.*;
public class TaskC3 {
    public static void main(String[] args) {
        String two = "два";
        String three = "три";
        String four = "четыре";
        String five = "пять";
        String six = "шесть";
        String seven = "семь";
        String eight = "восемь";
        String nine = "девять";
        String multiply = "умножить на";
        String equals = "равно";
        int i;
        String a = "";
        String b = "";
        String c = "";
        String d = "";
        String e = "";
        String f = "";
        String g = "";
        String h = "";
        String t = "";
        for (i = 1; i <= 9; i++) {
            a = two + " " + multiply + " ";
            if (i == 1) {
                a += two + " " + equals + " " + four;
            }
            if (i == 2) {
                a += three + " " + equals + " " + six;
            }
            if (i == 3) {
                a += four + " " + equals + " " + eight;
            }
            if (i == 4) {
                a += five + " " + equals + " " + "десять";
            }
            if (i == 5) {
                a += six + " " + equals + " " + "двенадцать";
            }
            if (i == 6) {
                a += seven + " " + equals + " " + "четырнадцать";
            }
            if (i == 7) {
                a += eight + " " + equals + " " + "шестнадцать";
            }
            if (i == 8) {
                a += nine + " " + equals + " " + "восемнадцать";
            }
            if (i == 9) {
                a += "десять" + " " + equals + " " + "двадцать";
            }
            System.out.println(a);

        }
        for (int j = 2; j <= 10; j++) {
            b = three + " " + multiply + " ";
            if (j == 2) {
                b += two + " " + equals + " " + six;
            }
            if (j == 3) {
                b += three + " " + equals + " " + nine;
            }
            if (j == 4) {
                b += four + " " + equals + " " + "двенадцать";
            }
            if (j == 5) {
                b += five + " " + equals + " " + "пятнадцать";
            }
            if (j == 6) {
                b += six + " " + equals + " " + "восемнадцать";
            }
            if (j == 7) {
                b += seven + " " + equals + " " + "двадцать один";
            }
            if (j == 8) {
                b += eight + " " + equals + " " + "двадцать четыре";
            }
            if (j == 9) {
                b += nine + " " + equals + " " + "двадцать семь";
            }
            if (j == 10) {
                b += "десять" + " " + equals + " " + "тридцать";
            }
            System.out.println(b);
        }
        for (int q = 2; q <= 10; q++) {
            c = four + " " + multiply + " ";
            if (q == 2) {
                c += two + " " + equals + " " + eight;
            }
            if (q == 3) {
                c += three + " " + equals + " " + "двенадцать";
            }
            if (q == 4) {
                c += four + " " + equals + " " + "шестнадцать";
            }
            if (q == 5) {
                c += five + " " + equals + " " + "двадцать";
            }
            if (q == 6) {
                c += six + " " + equals + " " + "двадцать четыре";
            }
            if (q == 7) {
                c += seven + " " + equals + " " + "двадцать восемь";
            }
            if (q == 8) {
                c += eight + " " + equals + " " + "тридцать два";
            }
            if (q == 9) {
                c += nine + " " + equals + " " + "тридцать шесть";
            }
            if (q == 10) {
                c += "десять" + " " + equals + " " + "сорок";
            }
            System.out.println(c);
        }
        for (int w = 2; w <= 10; w++) {
            d = five + " " + multiply + " ";
            if (w == 2) {
                d += two + " " + equals + " " + "десять";
            }
            if (w == 3) {
                d += three + " " + equals + " " + "пятнадцать";
            }
            if (w == 4) {
                d += four + " " + equals + " " + "двадцать";
            }
            if (w == 5) {
                d += five + " " + equals + " " + "двадцать пять";
            }
            if (w == 6) {
                d += six + " " + equals + " " + "тридцать";
            }
            if (w == 7) {
                d += seven + " " + equals + " " + "тридцать пять";
            }
            if (w == 8) {
                d += eight + " " + equals + " " + "сорок";
            }
            if (w == 9) {
                d += nine + " " + equals + " " + "сорок пять";
            }
            if (w == 10) {
                d += "десять" + " " + equals + " " + "пятьдесят";
            }
            System.out.println(d);
        }
        for (int sixsix = 2; sixsix <= 10; sixsix++) {
            e = six + " " + multiply + " ";
            if (sixsix == 2) {
                e += two + " " + equals + " " + "двенадцать";
            }
            if (sixsix == 3) {
                e += three + " " + equals + " " + "восемнадцать";
            }
            if (sixsix == 4) {
                e += four + " " + equals + " " + "двадцать четыре";
            }
            if (sixsix == 5) {
                e += five + " " + equals + " " + "тридцать";
            }
            if (sixsix == 6) {
                e += six + " " + equals + " " + "тридцать шесть";
            }
            if (sixsix == 7) {
                e += seven + " " + equals + " " + "сорок два";
            }
            if (sixsix == 8) {
                e += eight + " " + equals + " " + "сорок восемь";
            }
            if (sixsix == 9) {
                e += nine + " " + equals + " " + "пятьдесят четыре";
            }
            if (sixsix == 10) {
                e += "десять" + " " + equals + " " + "шестьдесят";
            }
            System.out.println(e);
        }
        for (int sevenn = 2; sevenn <= 10; sevenn++) {
            f = seven + " " + multiply + " ";
            if (sevenn == 2) {
                f += two + " " + equals + " " + "четырнадцать";
            }
            if (sevenn == 3) {
                f += three + " " + equals + " " + "двадцать один";
            }
            if (sevenn == 4) {
                f += four + " " + equals + " " + "двадцать восемь";
            }
            if (sevenn == 5) {
                f += five + " " + equals + " " + "тридцать пять";
            }
            if (sevenn == 6) {
                f += six + " " + equals + " " + "сорок два";
            }
            if (sevenn == 7) {
                f += seven + " " + equals + " " + "сорок девять";
            }
            if (sevenn == 8) {
                f += eight + " " + equals + " " + "пятьдесят шесть";
            }
            if (sevenn == 9) {
                f += nine + " " + equals + " " + "шестьдесят три";
            }
            if (sevenn == 10) {
                f += "десять" + " " + equals + " " + "семьдесят";
            }
            System.out.println(f);
        }
        for (int eightt = 2; eightt <= 10; eightt++) {
            g = eight + " " + multiply + " ";
            if (eightt == 2) {
                g += two + " " + equals + " " + "шестнадцать";
            }
            if (eightt == 3) {
                g += three + " " + equals + " " + "двадцать четыре";
            }
            if (eightt == 4) {
                g += four + " " + equals + " " + "тридцать два";
            }
            if (eightt == 5) {
                g += five + " " + equals + " " + "сорок";
            }
            if (eightt == 6) {
                g += six + " " + equals + " " + "сорок восемь";
            }
            if (eightt == 7) {
                g += seven + " " + equals + " " + "пятьдесят шесть";
            }
            if (eightt == 8) {
                g += eight + " " + equals + " " + "шестьдесят четыре";
            }
            if (eightt == 9) {
                g += nine + " " + equals + " " + "семьдесят два";
            }
            if (eightt == 10) {
                g += "десять" + " " + equals + " " + "восемьдесят";
            }
            System.out.println(g);
            }
            for (int ninee = 2; ninee <= 10; ninee++) {
                h = nine + " " + multiply + " ";
                if (ninee == 2) {
                    h += two + " " + equals + " " + "восемнадцать";
                }
                if (ninee == 3) {
                    h += three + " " + equals + " " + "двадцать семь";
                }
                if (ninee == 4) {
                    h += four + " " + equals + " " + "тридцать шесть";
                }
                if (ninee == 5) {
                    h += five + " " + equals + " " + "сорок пять";
                }
                if (ninee == 6) {
                    h += six + " " + equals + " " + "пятьдесят четыре";
                }
                if (ninee == 7) {
                    h += seven + " " + equals + " " + "шестьдесят три";
                }
                if (ninee == 8) {
                    h += eight + " " + equals + " " + "семьдесят два";
                }
                if (ninee == 9) {
                    h += nine + " " + equals + " " + "восемьдесят один";
                }
                if (ninee == 10) {
                    h += "десять" + " " + equals + " " + "девяносто";
                }
                System.out.println(h);
            }
            for (int tene = 2; tene <= 10; tene++) {
                t = "десять" + " " + multiply + " ";
                if (tene == 2) {
                    t += two + " " + equals + " " + "двадцать";
                }
                if (tene == 3) {
                    t += three + " " + equals + " " + "тридцать";
                }
                if (tene == 4) {
                    t += four + " " + equals + " " + "сорок";
                }
                if (tene == 5) {
                    t += five + " " + equals + " " + "пятьдесят";
                }
                if (tene == 6) {
                    t += six + " " + equals + " " + "шестьдесят";
                }
                if (tene == 7) {
                    t += seven + " " + equals + " " + "семьдесят";
                }
                if (tene == 8) {
                    t += eight + " " + equals + " " + "восемьдесят";
                }
                if (tene == 9) {
                    t += nine + " " + equals + " " + "девяносто";
                }
                if (tene == 10) {
                    t += "десять" + " " + equals + " " + "сто";
                }
                System.out.println(t);
            }


        }
    }

