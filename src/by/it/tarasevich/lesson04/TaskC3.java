package by.it.tarasevich.lesson04;

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
    public static void main(String[] args){
        for(int i = 1; i <=10; i++){
            for(int j = 1; j <=10; j++){
                System.out.print(i*j + " ");
            }
            System.out.println();
        }
        System.out.println("один умножить на один равно один" + "\n" +"один умножить на два равно два");
        System.out.println("один умножить на три равно три" + "\n" +"один умножить на четыре равно четыре");
        System.out.println("один умножить на пять равно пять" + "\n" +"один умножить на шесть равно шесть");
        System.out.println("один умножить на семь равно семь" + "\n" +"один умножить на восемь равно восемь");
        System.out.println("один умножить на девять равно девять" + "\n" +"один умножить на десять равно десять");
        System.out.println("два умножить на один равно два" + "\n" +"два умножить на два равно четыре");
        System.out.println("два умножить на три равно шесть" + "\n" +"два умножить на четыре равно восемь");
        System.out.println("два умножить на пять равно десять" + "\n" +"два умножить на шесть равно двенадцать");
        System.out.println("два умножить на семь равно четырнадцать" + "\n" +"два умножить на восемь равно шестнадцать");
        System.out.println("два умножить на девять равно восемнадцать" + "\n" +"два умножить на десять равно двадцать");
        System.out.println("три умножить на один равно три" + "\n" +"три умножить на два равно шесть");
        System.out.println("три умножить на три равно девять" + "\n" +"три умножить на четыре равно двенадцать");
        System.out.println("три умножить на пять равно пятнадцать" + "\n" +"три умножить на шесть равно восемнадцать");
        System.out.println("три умножить на семь равно двадцать один" + "\n" +"три умножить на восемь равно двадцать четыре");
        System.out.println("три умножить на девять равно двадцать семь" + "\n" +"три умножить на десять равно тридцать");
        System.out.println("четыре умножить на один равно четыре" + "\n" +"четыре умножить на два равно восемь");
        System.out.println("четыре умножить на три равно двенадцать" + "\n" +"четыре умножить на четыре равно шестнадцать");
        System.out.println("четыре умножить на пять равно двадцать" + "\n" +"четыре умножить на шесть равно двадцать четыре");
        System.out.println("четыре умножить на семь равно двадцать восемь" + "\n" +"четыре умножить на восемь равно тридцать два");
        System.out.println("четыре умножить на девять равно тридцать шесть" + "\n" +"четыре умножить на десять равно сорок");
        System.out.println("пять умножить на один равно пять" + "\n" +"пять умножить на два равно десять");
        System.out.println("пять умножить на три равно пятнадцать" + "\n" +"пять умножить на четыре равно двадцать");
        System.out.println("пять умножить на пять равно двадцать пять" + "\n" +"пять умножить на шесть равно тридцать");
        System.out.println("пять умножить на семь равно тридцать пять" + "\n" +"пять умножить на восемь равно сорок");
        System.out.println("пять умножить на девять равно сорок пять" + "\n" +"пять умножить на десять равно пятьдесят");
        System.out.println("шесть умножить на один равно шесть" + "\n" +"шесть умножить на два равно двенадцать");
        System.out.println("шесть умножить на три равно восемнадцать" + "\n" +"шесть умножить на четыре равно двадцать четыре");
        System.out.println("шесть умножить на пять равно тридцать" + "\n" +"шесть умножить на шесть равно тридцать шесть");
        System.out.println("шесть умножить на семь равно сорок два" + "\n" +"шесть умножить на восемь равно сорок восемь");
        System.out.println("шесть умножить на девять равно пятьдесят четыре" + "\n" +"шесть умножить на десять равно шестьдесят");
        System.out.println("семь умножить на один равно семь" + "\n" +"семь умножить на два равно четырнадцать");
        System.out.println("семь умножить на три равно двадцать один" + "\n" +"семь умножить на четыре равно двадцать восемь");
        System.out.println("семь умножить на пять равно тридцать пять" + "\n" +"семь умножить на шесть равно сорок два");
        System.out.println("семь умножить на семь равно сорок девять" + "\n" +"семь умножить на восемь равно пятьдесят шесть");
        System.out.println("семь умножить на девять равно шестьдесят три" + "\n" +"семь умножить на десять равно семьдесят");
        System.out.println("восемь умножить на один равно восемь" + "\n" +"восемь умножить на два равно шестнадцать");
        System.out.println("восемь умножить на три равно двадцать четыре" + "\n" +"восемь умножить на четыре равно тридцать два");
        System.out.println("восемь умножить на пять равно сорок" + "\n" +"восемь умножить на шесть равно сорок восемь");
        System.out.println("восемь умножить на семь равно пятьдесят шесть" + "\n" +"восемь умножить на восемь равно шестьдесят четыре");
        System.out.println("восемь умножить на девять равно семьдесят два" + "\n" +"восемь умножить на десять равно восемьдесят");
        System.out.println("девять умножить на один равно девять" + "\n" +"девять умножить на два равно восемнадцать");
        System.out.println("девять умножить на три равно двадцать семь" + "\n" +"девять умножить на четыре равно тридцать шесть");
        System.out.println("девять умножить на пять равно сорок пять" + "\n" +"девять умножить на шесть равно пятьдесят четыре");
        System.out.println("девять умножить на семь равно шестьдесят три" + "\n" +"девять умножить на восемь равно семьдесят два");
        System.out.println("девять умножить на девять равно восемьдесят один" + "\n" +"девять умножить на десять равно девяносто");
        System.out.println("десять умножить на один равно десять" + "\n" +"десять умножить на два равно двадцать");
        System.out.println("десять умножить на три равно тридцать" + "\n" +"десять умножить на четыре равно сорок");
        System.out.println("десять умножить на пять равно пятьдесят" + "\n" +"десять умножить на шесть равно шестьдесят");
        System.out.println("десять умножить на семь равно семьдесят" + "\n" +"десять умножить на восемь равно восемьдесят");
        System.out.println("десять умножить на девять равно девяносто" + "\n" +"десять умножить на десять равно сто");
    }
    }


