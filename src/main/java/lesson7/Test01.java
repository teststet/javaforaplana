package lesson7;

import java.sql.SQLOutput;

import static java.lang.Math.*;

public class Test01 {


    public static void main(String[] args) {
    //avg(17,17);
    //trans(14);

    //int primer = findX(564);
    //System.out.println(primer);

    //krug(32,16);
    //mandn(4, 2);
    //srav(492, 0);
    //minDiv(200, 17);
    //dayWeek(2);

    //int[] mas = {1,2,3,4,5,6,7,8};
    //chet(mas);

    //System.out.println(lenClub("Динамо"));
    //formaAndTik("Информатика");
    //findFirstAndLast("Сколько букв е в слове неестественнее");
    findNN("Клмнн одинн");
    }

    //Задача 0

    public static int  sum (int x, int y) {
        int summ = x + y;
        if(summ > 0) System.out.println("Положительный");
        else System.out.println("Отрицательный");
        return summ;
    }

    //Задача 1
    public static int firstTask (int x, int y, int z) {
        if(x*y+37 > 0)  {
            z = z * 2;
            return 7*x+y;
        }
        else {
            if ( x == 0) {
                z = z / 2;
            } else z = z / 5;

            return 5 * y - x;
        }
    }

    //Задача 2
    public static void avg (int x, int y) {
        int avg1 = (x + y) / 2;

        System.out.println("Средний возраст Тани и Мити " + avg1);

        if (avg1 > x && avg1 < y) {
            System.out.println("Возраст Тани меньше на " + (avg1-x));
            System.out.println("Возраст Мити больше на " + (y-avg1));
        }

        else if (avg1 < x && avg1 > y) {
            System.out.println("Возраст Тани меньше на " + (x-avg1));
            System.out.println("Возраст Мити больше на " + (avg1-y));
        }

        else System.out.println("Возраст Тани и Мити одинаковый");

    }

    //Задача 3
    public static void trans (double c) {

        System.out.println("Температура по Цельсию равна "  + c );
        System.out.println("Температура по Фаренгейту будет " + ((c * 1.8) + 32));
        System.out.println("Температура по Кельвину будет " + (273.15 - c));

    }

    //Задача 4
    public static int findX (int x) {
        return x % 10 * 100 + x / 10;
    }

    //Задача 5
    public static void krug (double sCircle, double sSquare) {
        //Находим диаганаль круга и длину стороны с диагональю квадрата
        double cDiagonal = (sqrt(sCircle /  PI)) * 2;
        //System.out.println(cDiagonal);
        double sSide = sqrt(sSquare);
        //System.out.println(sSide);
        double sDiagonal = sqrt(2 * pow(sSide, 2));
        //System.out.println(sDiagonal);

        if (cDiagonal <= sSide) System.out.println("Круг уместится в квадрате");
        else System.out.println("Круг не уместится в квадрате");

        if (sDiagonal <= cDiagonal) System.out.println("Квадрат уместится в круге");
        else System.out.println("Квадрат не уместится в круге");
    }

    //Задача 6
    public static void mandn (int m, int n) {

        if ((m % n) == 0) System.out.println("Частное от деления m / n = " + (m / n));
        else System.out.println("m на n нацело не делится");
    }

    //Задача 7
    public static void findMax (int ch) {

        System.out.println("Трехзначное число = " + ch);

        int xAz = (ch / 100) > (ch % 10) ? (ch / 100) : (ch % 10);
        System.out.println("Между первой и третьей цифрой больше " + xAz);

        int xAy = (ch / 100) > ((ch / 10) % 10) ? (ch / 100) : ((ch / 10) % 10);
        System.out.println("Между первой и второй цифрой больше " + xAy);

        int yAz = ((ch / 10) % 10) > (ch % 10) ? ((ch / 10) % 10) : (ch % 10);
        System.out.println("Между второй и третьей цифрой больше " + yAz);
    }

    //Задача 8
    public static void srav (int ch, int n) {
        int x = ch / 100;
        int y = ch / 10 % 10;
        int z = ch % 10;

        if( x == n || y == n || z == n ) System.out.println("Цифра " + n + " входит в число " + ch);
        else System.out.println("Цифра " + n + " не входит в число " + ch);

    }
    //Задача 9
    public static void dayWeek (int ch) {

        switch (ch) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресенье");
                break;
            default:
                System.out.println("Эта цифра не соответсвует дню недели");
        }
    }
    //Задача 10
    public static void chet (int[] x) {
        int chetCh = 0;
        for(int i = 0; i < x.length; i ++) {
            if((x[i] % 2) == 0 ) {
                chetCh++;
            }
        }
        System.out.println("Количество четных чисел = " + chetCh);
    }
    //Задача 11
    public static void minDiv (int x, int y) {
        while((x % y) != 0) {
            x++;
        }
        System.out.println(x);
    }

    //Задача 12
    public static int lenClub (String s) {
        return s.length();
    }
    //Задача 13
    public static void formaAndTik (String s) {
       String forma = s.substring(2,7);
       String tik = s.substring(7,10);
       System.out.println(s);
       System.out.println(forma);
       System.out.println(tik);
    }
    //Задача 14
    public static void findNN (String s) {
        String nn;
        for(int i = 0; i < s.length() - 1; i++) {
            nn = String.valueOf(s.charAt(i)) + String.valueOf(s.charAt(i+1));
            //System.out.println(nn);
            if(nn.equals("нн")) System.out.println(nn);
        }
    }
    //Задача 15
    public static void findFirstAndLast (String s) {
        int first = s.indexOf("е") + 1 ;
        int last = s.lastIndexOf("е") + 1;
        System.out.println(s);
        System.out.println("Порядковый номер первой буквы е равен " + first);
        System.out.println("Порядковый номер последней  буквы е равен " + last);
    }

}

