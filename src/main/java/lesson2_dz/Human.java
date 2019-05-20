package lesson2_dz;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public abstract class  Human {
    {
        idGenertor++;
    }

    private static int idGenertor = 0;
    private int id = idGenertor;
    private String family;
    private String first_name;
    private String second_name;
    private Date date;
    private String adress;
    private int phone;

    public Human()  {
        this.family = rand_fam();
        this.first_name = rand_firstName();
        this.second_name = rand_secondName();
        this.date = rand_date();
        this.adress = rand_adr();
        this.phone = rand_tel();
    }
    public int getId() {
        return id;
    }

    public String getFamily() {
        return family;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getSecond_name() {
        return second_name;
    }

    public Date getDate() {
        return date;
    }

    public String getAdress() {
        return adress;
    }

    public int getPhone() {
        return phone;
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
    public static Date rand_date()  {
        Random r = new Random();
        Date date = null;
        String[] name = {"10.01.1997", "02.12.1998", "15.05.2001", "10.02.1999", "07.11.1995", "27.06.1994", "21.07.1995", "15.09.1997", "18.11.1995"};
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        int n = r.nextInt(9);
        try {
            date = format.parse(name[n]);
        } catch (ParseException e) {
            e.printStackTrace();
        }
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

    public abstract void i_am ();

}
