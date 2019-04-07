package lesson2_dz;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

//Подключаем класс студент, что использовать методы рандомизации
import static lesson2_dz.Main_Student.*;

public class Main_Customer {
    public static void main(String[] args) {
        Customer[] shop = new Customer[20];

        for(int i = 0; i < shop.length; i++){
            shop[i] = new Customer(i,rand_fam(),rand_firstName(),rand_secondName(),rand_adr(), rand_card(), rand_bank());
        }

        for(int i = 0; i < shop.length; i++){
            shop[i].print_customer();
        }

        for(int i = 0; i < shop.length; i++){
            shop[i].print_sort_card(4321128100000000L,4321562300009999L);
        }


        System.out.println("\nSorted:");
        Arrays.sort(shop);
        {
            for (int i = 0; i < shop.length; i++) {
                shop[i].print_customer();
            }
        }

    }
    //Метод, который позволяет получить рандомную переменную лонг в нужном диапозоне
    public static long rand_card() {
        long n = ThreadLocalRandom.current().nextLong(4321000000000000L,4321999999999999L);
        return n;
    }

    public static long rand_bank() {
        long n = ThreadLocalRandom.current().nextLong(1234000000000000L,1234999999999999L);
        return n;
    }
}
