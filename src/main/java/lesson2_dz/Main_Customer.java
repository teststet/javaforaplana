package lesson2_dz;

import java.text.ParseException;
import java.util.Arrays;

public class Main_Customer {
    public static void main(String[] args) throws ParseException {
        Customer[] shop = new Customer[20];

        for(int i = 0; i < shop.length; i++){
            shop[i] = new Customer();
        }

        for(int i = 0; i < shop.length; i++){
            shop[i].print_customer();
        }

        //Вывод клиентов попавших в  заданном интервале
        System.out.println("\nВывод клиентов попавших в  заданном интервале:");
        for(int i = 0; i < shop.length; i++){
            shop[i].print_sort_card(4321128100000000L,4321562300009999L);
        }

        //Сортировака массива объектов по ФИО и вывод клиентов в алфавитном порядке
        System.out.println("\nВывод клиентов в алфавитном порядке:");
        Arrays.sort(shop);
        {
            for (int i = 0; i < shop.length; i++) {
                shop[i].print_customer();
            }
        }

    }

}
