package lesson2_dz;

import java.util.*;

import static java.lang.Math.*;


public class dz2_first {
    public static void main(String[] args) {
    //getChetAndNechet(getRandomNumbers(9));
    //getMaxAndMin(getRandomNumbers(10));
    //div3or9(getRandomNumbers(10));
    //div5and7(getRandomNumbers(1000));
    //formaAndTik("ываыва вкуемсчсм информатика ывываыфв");
    //modSort(getRandomNumbers(10));
    //SimpleCh(getRandomNumbers(100));
    //sortUpOrDown(getRandomNumbers(20), 2);
    //sortDownCh(getRandomNumbers(20));
    //tripNum(getRandomNumbers(100), 3);
   //int[] kolp = {21, 37,  54, 1, 11211, 1221, 22, 9999999, 99999999};
    //palindromCh(kolp);
    //polSumSosed(getRandomNumbers(1000));

    period_tenFanction(getRandomNumbers(10));
    }

    public static int[] getRandomNumbers(int count) {
        int[] res = new int[count];

        Random r = new Random();

        for (int i = 0; i < count; i++) {
            res[i] = r.nextInt(300) - 200;
            System.out.println(res[i]);
        }
        System.out.println("-------------------------");
        return res;
    }
    //(0)	Из предложения, содержащего слово «информатика» путем "вырезок" и "склеек" его букв получить слова «форма» и «тик».
    public static void formaAndTik (String s) {
        int n = s.indexOf("информатика");
        String forma = s.substring(n + 2, n + 7);
        String tik = s.substring(n + 7, n + 10);
        System.out.println(s);
        System.out.println(forma);
        System.out.println(tik);
    }


    //(1)	Четные и нечетные числа.
    public static void getChetAndNechet (int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if((arr[i] % 2) == 0) {
                System.out.println("Четное: " + arr[i]);
            }else System.out.println("Нечетное: " + arr[i]);
        }
    }

    //(2)	Наибольшее и наименьшее число.
    public static void getMaxAndMin (int[] arr) {
        int minCh = arr[0];
        int maxCh = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            minCh = minCh < arr[i+1] ? minCh : arr[i+1];
            maxCh = maxCh > arr[i+1] ? maxCh : arr[i+1];
        }
        System.out.println("Минимальное число = " + minCh);
        System.out.println("Максимальное число = " + maxCh);
    }

    //(3)	Числа, которые делятся на 3 или на 9.
    public static void div3or9 (int[] arr) {
        System.out.println("Числа которые делятся на 3 или на 4");
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] % 3) == 0 || (arr[i] % 4) == 0)
                System.out.println(arr[i]);
        }

    }
    //(4)	Числа, которые делятся на 5 и на 7.
    public static void div5and7 (int[] arr) {
        System.out.println("Числа которые делятся на 5 и на 7");
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] % 5) == 0 && (arr[i] % 7) == 0)
                System.out.println(arr[i]);
        }

    }
    //(5)	Элементы, расположенные методом пузырька по убыванию модулей.
    public static int[] modSort (int[] mas) {
        int[] arr = mas;
        for(int i = arr.length-1 ; i > 0 ; i--) {
            for(int j = 0 ; j < i ; j++) {
                if( abs(arr[j]) < abs(arr[j+1])){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
        for(int i = 0; i < arr.length; i++ ) {
            System.out.println(arr[i]);
        }
        return arr;
    }
    //(6)	Все трехзначные числа, в десятичной записи которых нет одинаковых цифр.
    public static void tripNum (int[] arr, int b) {
        String s;
        int m;
        for (int i = 0; i < arr.length; i++) {
            //Узнаем количество цифр в числе
            int num = (int) Math.log10(abs(arr[i])) + 1;
            //System.out.println("Num =" + num);
            //Если количество цифр не совпадает, то переходим к следующиму числу
            if (b != num)
                continue;
            //Присваиваем переменным значение перед проверкой
            s = Integer.toString(arr[i]);
            m = b;
            boolean pravda = true;
            //По символьная проверка числа
            for(int j = 0; j < s.length() - 1; j++) {
                //Если первый символ минус, то проверям на символ больше
                if (s.charAt(j) == '-') {
                    m++;
                    //System.out.println(m);
                    continue;
                }
                //Последовательно проверям каждый символ
                for(int n = j+1; n < m ; n++) {
                    if ((s.charAt(j) == s.charAt(n))) {
                        pravda = false;
                        break;
                    }
                }
            }
            //Если нет одинаковых цифр, то печатаем
            if(pravda)
                System.out.println(s);
        }
    }

    //(7)	Наибольший общий делитель и наименьшее общее кратное этих чисел.

    //(8)	Простые числа.
    //https://www.dpva.ru/Guide/GuideMathematics/GuideMathematicsFiguresTables/SimpleFigures/SimpleFiguresPrint/
    public static void SimpleCh (int[] arr) {
        boolean pravda;
        for(int i = 0; i < arr.length; i++) {
            pravda = true;
            if(arr[i] < 2)
                continue;
            for(int d=2; d*d <= arr[i]; d++) {
                if((arr[i] % d) == 0)
                    pravda = false;
            }
            if(pravda) System.out.println(arr[i]);
        }
    }
    //(9)	Отсортированные числа в порядке возрастания и убывания.
    public static int[] sortUpOrDown (int[] arr, int t) {
                for(int i = arr.length-1 ; i > 0 ; i--) {
                    for(int j = 0 ; j < i ; j++) {
                        if(( t == 1 && arr[j] > arr[j+1]) || ( t == 2 && arr[j] < arr[j+1])){
                            int tmp = arr[j];
                            arr[j] = arr[j+1];
                            arr[j+1] = tmp;
                        }
                    }
                }
                for(int i = 0; i < arr.length; i++ ) {
                System.out.println(arr[i]);
                }
        return arr;
    }
    //(10)	 Числа в порядке убывания частоты встречаемости чисел.
 /*   public static void sortDownCh (int[] arr) {
        int ch = 0;
        String s = "";
        String y = "";
        String z = "";
        for(int i = 0; i < arr.length; i++){
            s += Integer.toString(arr[i]) + " ";
        }
        System.out.println(s);
        for(int i = 0; i < s.length(); i++) {
            y = s.substring(i, );
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j) && s.charAt(i) != 'n') {
                    ch++;
                    s.replace(s.charAt(j), 'n');
                }
                for(int b = 0; b < ch; b++)
                    z += s.charAt(i);
                ch = 0;
            }
        }
        System.out.println(y);
        System.out.println(z);

    }*/
    //(11)	. «Счастливые числа».  188 = 1^2 + 8^2 + 8^2 = 129 = 1^2 + 2^2 + 9^2
    //(12)	. Числа Фибоначчи: f0 = f1 = 1, f (n) = f (n–1) + f (n–2).
    //(13)	. Числа-палиндромы, значения которых в прямом и обратном порядке совпадают.
    public static void palindromCh (int[] arr) {
        String s;
        String first;
        String second;
        for(int i = 0; i < arr.length; i++){
            s = Integer.toString(arr[i]);
            int begin;
            if (s.charAt(0) != '-' ) {
                first = s.substring(0,s.length()/2);
                begin = s.length() % 2 != 0 ? s.length()/2 + 1 : s.length()/2;
                second = new StringBuffer(s.substring(begin, s.length())).reverse().toString();
                if(first.equals(second))
                    System.out.println(arr[i]);
            }
        }
    }
    //(14)	. Элементы, которые равны полусумме соседних элементов.
    public static void polSumSosed (int[] arr) {
        for (int i = 1; i < arr.length - 1; i++) {
                if (arr[i] == ((arr[i - 1] + arr[arr.length + 1]) / 2))
                    System.out.println(arr[i]);
            }
        }
    //(15)	. Период десятичной дроби p = m/n для первых двух целых положительных чисел n и m, расположенных подряд.
    public  static void period_tenFanction (int [] arr) {
        double m;
        double n;
        double p;
        String strM;
        String strN;
        for (int i = 1; i < arr.length; i++) {
            strM = Integer.toString(arr[i-1]);
            strN = Integer.toString(arr[i]);
            System.out.println(strM);
            System.out.println(strN);
            if(strM.charAt(0) == '-' || strN.charAt(0) == '-')
                continue;

            m = (double) arr[i-1];
            n = (double) arr[i];
            p = m / n;
            System.out.println(p);
            break;
        }
    }
    //(16)	Построить треугольник Паскаля для первого положительного числа


}
