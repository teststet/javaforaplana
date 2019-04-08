package lesson2_dz;

//Подключаем класс студент, что использовать методы рандомизации
import java.util.Random;

import static lesson2_dz.Main_Student.*;

public class Main_Abiturient {
    public static void main(String[] args) {

        Abiturient[] ab = new Abiturient[10];

        for(int i = 0; i < ab.length; i++ )
            ab[i] = new Abiturient(i, rand_fam(),rand_firstName(),rand_secondName(),rand_adr(), rand_tel(), rand_retings());

        for(int i = 0; i < ab.length; i++ )
            ab[i].print_abiturient();

        System.out.println("\nCписок абитуриентов, имеющих неудовлетворительные оценки: ");
        for(int i = 0; i < ab.length; i++ ) {
            ab[i].print_neud();
        }

        int sum = 10;
        System.out.println("\nCписок абитуриентов, у которых сумма баллов выше заданной: ");
        for(int i = 0; i < ab.length; i++ ) {
            ab[i].print_sum(sum);
        }


        sum = 0;
        for(int j = 0; j < ab.length; j++ ) {
            if(ab[j].getSum() > sum)
                sum = ab[j].getSum();
        }

        int n  = 2;
        System.out.println("\nОтличники в количетсве " + n + " штук: ");
        for(int i = 0; i < ab.length; i++ ) {
            if(sum == ab[i].getSum() && n > 0) {
                ab[i].print_abiturient();
                n--;
            }
        }
        System.out.println("\nПолный список абитуриентов, имеющих полупроходную сумму: ");
        for(int i = 0; i < ab.length; i++ ) {
            if(ab[i].getSum() == ((5*ab[i].getRatings().length) / 2))
                ab[i].print_abiturient();
        }



    }

    public static int[] rand_retings() {
        Random r = new Random();
        int[] n = new int[3];
        for(int i = 0; i < n.length; i++)
            n[i] = r.nextInt(5) + 1;
        return n;
    }
}
