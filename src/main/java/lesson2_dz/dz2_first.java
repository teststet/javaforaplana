package lesson2_dz;

import java.util.*;

public class dz2_first {
    public static void main(String[] args) {
    //getChetAndNechet(getRandomNumbers(9));
    getMaxAndMin(getRandomNumbers(10));
    }

    public static int[] getRandomNumbers(int count) {
        int[] res = new int[count];

        Random r = new Random();

        for (int i = 0; i < count; i++) {
            res[i] = r.nextInt(200) - 100;
            System.out.println(res[i]);
        }
        return res;
    }

    //Задание 1
    public static void getChetAndNechet (int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if((arr[i] % 2) == 0) {
                System.out.println("Четное: " + arr[i]);
            }else System.out.println("Нечетное: " + arr[i]);
        }
    }

    //Задание 2
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
}
