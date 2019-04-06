package lesson2_dz;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) throws ParseException {
//        System.out.println(rand_kur());
        Student[] ngtu = new Student[10];
        for(int i = 0; i < ngtu.length; i++){
            ngtu[i] = new Student(i,rand_fam(),rand_firstName(),rand_secondName(),rand_date(),rand_adr(),rand_tel(),rand_fac(),rand_kur(),rand_group());
        }

        System.out.println("========================================================");
        System.out.println("Все студенты");
        System.out.println("========================================================");
        for(int i = 0; i < ngtu.length; i++){
            ngtu[i].print_student();
        }

        System.out.println("========================================================");
        System.out.println("По факультету и курсу");
        System.out.println("========================================================");
        for(int i = 0; i < ngtu.length; i++){
            ngtu[i].print_FakAndKurs("Экономический", 2);
        }

        System.out.println("========================================================");
        System.out.println("Год рождения больше установленной ");
        System.out.println("========================================================");
        for(int i = 0; i < ngtu.length; i++){
            ngtu[i].print_dr(1997);
        }

        String[] gr = {"11-ИВТ-1", "12-Эк", "14-К-2", "14-ФК-3"};
        System.out.println("========================================================");
        System.out.println("По группам");
        System.out.println("========================================================");
        for(int j = 0; j < gr.length; j++){
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("Группа " + gr[j]);
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            for(int i = 0; i < ngtu.length; i++){
                ngtu[i].print_grup(gr[j]);
            }
        }


    }
    public static String rand_fam () {
        Random r = new Random();
        String[] name = {"Иванов", "Петров", "Подольск", "Лопатин", "Крапивин", "Четвертаков", "Касперский", "Грин", "Белов"};
        int n = r.nextInt(9);
        return name[n];
    }

    public static String rand_firstName () {
        Random r = new Random();
        String[] name = {"Сергей", "Иван", "Петр", "Анатолий", "Дмитрий", "Виталий", "Максим", "Джек", "Владимир"};
        int n = r.nextInt(9);
        return name[n];
    }

    public static String rand_secondName () {
        Random r = new Random();
        String[] name = {"Сергеевич", "Иванович", "Петрович", "Анатолевич", "Дмитривич", "Витальевич", "Максимович", "Джекович", "Владимирович"};
        int n = r.nextInt(9);
        return name[n];
    }
    public static Date rand_date() throws ParseException {
        Random r = new Random();
        Date date;
        String[] name = {"10.01.1997", "02.12.1998", "15.05.2001", "10.02.1999", "07.11.1995", "27.06.1994", "21.07.1995", "15.09.1997", "18.11.1995"};
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        int n = r.nextInt(9);
        date = format.parse(name[n]);
        return date;
    }
    public static String rand_adr() {
        Random r = new Random();
        String[] name = {"Адресс1", "Адресс2", "Адресс3", "Адресс4", "Адресс5", "Адресс6", "Адресс7", "Адресс8", "Адресс9"};
        int n = r.nextInt(9);
        return name[n];
    }
    public static int rand_tel() {
        Random r = new Random();
        int n = r.nextInt(100) + 100;
        return n;
    }
    public static String rand_fac() {
        Random r = new Random();
        String[] name = {"Экономический", "ИРИТ", "Физико-Математический"};
        int n = r.nextInt(3);
        return name[n];
    }

    public static int rand_kur() {
        Random r = new Random();
        int n = r.nextInt(5) + 1;
        return n;
    }

    public static String rand_group() {
        Random r = new Random();
        String[] name = {"11-ИВТ-1", "12-Эк", "14-К-2", "14-ФК-3"};
        int n = r.nextInt(4);
        return name[n];
    }


}
