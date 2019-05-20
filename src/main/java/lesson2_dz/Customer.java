package lesson2_dz;

import java.text.ParseException;
import java.util.concurrent.ThreadLocalRandom;

public class Customer extends Human implements Comparable<Customer>{

    private long num_card;
    private long num_bank;

    public Customer()  {
        super();
        this.num_card = rand_card();
        this.num_bank = rand_bank();
    }

    @Override
    public void i_am() {
        System.out.println("I am Customer");
    }


    public static long rand_card() {
        long n = ThreadLocalRandom.current().nextLong(4321000000000000L,4321999999999999L);
        return n;
    }

    public static long rand_bank() {
        long n = ThreadLocalRandom.current().nextLong(1234000000000000L,1234999999999999L);
        return n;
    }

    public long getNum_card(){
        return num_card;
    }

    public long getNum_bank() {
        return num_bank;
    }
//Метод, который позволяет получить рандомную переменную лонг в нужном диапозоне


    //Возращает полное ФИО
    public String getFullname() {
        return getFamily() + " " + getFirst_name() + " " + getSecond_name();
    }

    //Вывод данных
    public void print_customer () {
        System.out.println(getId() + "\t" + getFamily() +  "\t" + getFirst_name() + "\t" + getSecond_name() + "\t" + getAdress() + "\t" + getNum_card() + "\t" + getNum_bank());
    }

    //Выводим данные, если они входят в заданный интервал
    public void print_sort_card(long p1, long p2) {
        if(getNum_card() > p1 && getNum_card() < p2)
            print_customer();
    }

    //Интерфейс для сравнения двух строк
    @Override
    public int compareTo(Customer o) {
        return getFullname().compareTo(o.getFullname());
    }

}
