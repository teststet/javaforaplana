package lesson2_dz;

import java.text.ParseException;

public class Main_Abiturient {
    public static void main(String[] args) throws ParseException {
        int sum = 0;
        Abiturient[] ab = new Abiturient[10];

        for(int i = 0; i < ab.length; i++ )
            ab[i] = new Abiturient();

        for(int i = 0; i < ab.length; i++ ) {
            ab[i].print_abiturient();

            if(ab[i].getSum() > sum)
                sum = ab[i].getSum();
        }


        System.out.println("\nCписок абитуриентов, имеющих неудовлетворительные оценки: ");
        for(int i = 0; i < ab.length; i++ ) {
            ab[i].print_neud();
        }

        System.out.println("\nCписок абитуриентов, у которых сумма баллов выше заданной: ");
        for(int i = 0; i < ab.length; i++ ) {
            ab[i].print_sum(10);
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
            ab[i].print_halfSum();
        }
    }
}
