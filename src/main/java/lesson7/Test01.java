package lesson7;

import java.sql.SQLOutput;

import static java.lang.Math.*;

public class Test01 {


//    public static void main(String[] args) {
//        String adress = "E:\\test01Java\\src\\main\\java\\lesson7\\";
//        String adress2 = "C:\\aplana-test\\javaforaplana\\src\\main\\java\\lesson7\\";
//        MyReader outputfile = new MyReader(adress2 + "Text.txt");
//        MyReader inputfile = new MyReader("E:\\test01Java\\src\\main\\java\\lesson7\\Text1.txt");
//        MyBuffer buffer = new MyBuffer(adress2 + "Text1.txt");
//        String b = String.valueOf(sum(17,17));
//        buffer.setFileText(b);
//    //trans(14);
//
//    //int primer = findX(564);
//    //System.out.println(primer);
//
//    //krug(32,16);
//    //mandn(4, 2);
//    //srav(492, 0);
//    //minDiv(200, 17);
//    //dayWeek(2);
//
//    //int[] mas = {1,2,3,4,5,6,7,8};
//    //chet(mas);
//
//    //System.out.println(lenClub("Динамо"));
//    //formaAndTik("Информатика");
//        buffer.setFileText(findFirstAndLast(outputfile.getFileText()));
//    //findNN("Клмнн одинн");
//    }

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
    public static String avg (int x, int y) {
        int avg1 = (x + y) / 2;

        System.out.println("Средний возраст Тани и Мити " + avg1);

        if (avg1 > x && avg1 < y) {
            System.out.println("Возраст Тани меньше на " + (avg1-x));
            System.out.println("Возраст Мити больше на " + (y-avg1));
            return "Возраст Тани меньше на " + (avg1-x) + "\nВозраст Мити больше на " + (y-avg1);
        }

        else if (avg1 < x && avg1 > y) {
            System.out.println("Возраст Тани меньше на " + (x-avg1));
            System.out.println("Возраст Мити больше на " + (avg1-y));
            return "Возраст Тани меньше на " + (x-avg1) + "\n" + "Возраст Мити больше на " + (avg1-y);
        }

        else {
            System.out.println("Возраст Тани и Мити одинаковый");
            return "Возраст Тани и Мити одинаковый";
        }

    }

    //Задача 3
    public static String trans (double c) {
        System.out.println("Температура по Цельсию равна "  + c );
        System.out.println("Температура по Фаренгейту будет " + ((c * 1.8) + 32));
        System.out.println("Температура по Кельвину будет " + (273.15 - c));
        return "Температура по Цельсию равна "  + c + "\nТемпература по Фаренгейту будет " + ((c * 1.8) + 32) + "\nТемпература по Кельвину будет " + (273.15 - c);
    }

    //Задача 4
    public static int findX (int x) {
        return x % 10 * 100 + x / 10;
    }

    //Задача 5
    public static String krug (double sCircle, double sSquare) {
        String s;
        String z;
        //Находим диаганаль круга и длину стороны с диагональю квадрата
        double cDiagonal = (sqrt(sCircle /  PI)) * 2;
        //System.out.println(cDiagonal);
        double sSide = sqrt(sSquare);
        //System.out.println(sSide);
        double sDiagonal = sqrt(2 * pow(sSide, 2));
        //System.out.println(sDiagonal);

        if (cDiagonal <= sSide) {
            System.out.println("Круг уместится в квадрате");
            s = "Круг уместится в квадрате";
        }
        else {
            System.out.println("Круг не уместится в квадрате");
            s = "Круг не уместится в квадрате";
        }

        if (sDiagonal <= cDiagonal) {
            System.out.println("Квадрат уместится в круге");
            z = "Квадрат уместится в круге";
        }
        else {
            System.out.println("Квадрат не уместится в круге");
            z = "Квадрат не уместится в круге";
        }
        return s + "\n" + z;
    }

    //Задача 6
    public static String mandn (int m, int n) {
        String s;
        if ((m % n) == 0) {
            System.out.println("Частное от деления m / n = " + (m / n));
            s = "Частное от деления m / n = " + (m / n);
        }
        else {
            System.out.println("m на n нацело не делится");
            s = "m на n нацело не делится";
        }
        return  s;
    }

    //Задача 7
    public static String findMax (int ch) {

        System.out.println("Трехзначное число = " + ch);

        int xAz = (ch / 100) > (ch % 10) ? (ch / 100) : (ch % 10);
        System.out.println("Между первой и третьей цифрой больше " + xAz);

        int xAy = (ch / 100) > ((ch / 10) % 10) ? (ch / 100) : ((ch / 10) % 10);
        System.out.println("Между первой и второй цифрой больше " + xAy);

        int yAz = ((ch / 10) % 10) > (ch % 10) ? ((ch / 10) % 10) : (ch % 10);
        System.out.println("Между второй и третьей цифрой больше " + yAz);
        return "Между первой и третьей цифрой больше " + xAz + "\nМежду первой и второй цифрой больше " + xAy + "\nМежду второй и третьей цифрой больше " + yAz;
    }

    //Задача 8
    public static String srav (int ch, int n) {
        String s = "";
        int x = ch / 100;
        int y = ch / 10 % 10;
        int z = ch % 10;

        if( x == n || y == n || z == n ) {
            System.out.println("Цифра " + n + " входит в число " + ch);
            s = "Цифра " + n + " входит в число " + ch;
        }
        else {
            System.out.println("Цифра " + n + " не входит в число " + ch);
            s = "Цифра " + n + " не входит в число " + ch;
        }
        return s;

    }
    //Задача 9
    public static String dayWeek (int ch) {
        String s = "Эта цифра не соответсвует дню недели";
        switch (ch) {
            case 1:
                System.out.println("Понедельник");
                s = "Понедельник";
                break;
            case 2:
                System.out.println("Вторник");
                s = "Вторник";
                break;
            case 3:
                System.out.println("Среда");
                s = "Среда";
                break;
            case 4:
                System.out.println("Четверг");
                s = "Четверг";
                break;
            case 5:
                System.out.println("Пятница");
                s = "Пятница";
                break;
            case 6:
                System.out.println("Суббота");
                s = "Суббота";
                break;
            case 7:
                System.out.println("Воскресенье");
                s = "Воскресенье";
                break;
            default:
                System.out.println("Эта цифра не соответсвует дню недели");
        }
        return s;
    }
    //Задача 10
    public static String chet (int[] x) {
        int chetCh = 0;
        for(int i = 0; i < x.length; i ++) {
            if((x[i] % 2) == 0 ) {
                chetCh++;
            }
        }
        System.out.println("Количество четных чисел = " + chetCh);
        return "Количество четных чисел = " + chetCh;
    }
    //Задача 11
    public static String minDiv (int x, int y) {
        while((x % y) != 0) {
            x++;
        }
        System.out.println(x);
        return String.valueOf(x);
    }

    //Задача 12
    public static int lenClub (String s) {
        return s.length();
    }
    //Задача 13
    public String  formaAndTik (String s) {
        int n = s.indexOf("информатика");
        String forma = s.substring(n + 2, n + 7);
        String tik = s.substring(n + 7, n + 10);
        System.out.println(s);
        System.out.println(forma);
        System.out.println(tik);
        return s + "\n" + forma + "\n" + tik;
    }

    //Задача 14
    public static String findNN (String s) {
        String nn = "";
        for(int i = 0; i < s.length() - 1; i++) {
            nn = String.valueOf(s.charAt(i)) + String.valueOf(s.charAt(i+1));
            //System.out.println(nn);
            if(nn.equals("нн")) System.out.println(nn);
        }
        return nn;
    }
    //Задача 15
    public static String findFirstAndLast (String s) {
        int first = s.indexOf("е") + 1 ;
        int last = s.lastIndexOf("е") + 1;
        System.out.println(s);
        System.out.println("Порядковый номер первой буквы е равен " + first);
        System.out.println("Порядковый номер последней  буквы е равен " + last);
        return "Порядковый номер первой буквы е равен " + first + "\nПорядковый номер последней  буквы е равен " + last;
    }

}

