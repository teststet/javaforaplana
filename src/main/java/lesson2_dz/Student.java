package lesson2_dz;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Random;

public class Student extends Human{
    private String facultate;
    private int kurs;
    private String gruppa;

    public Student() {
        super();
        this.facultate = rand_fac();
        this.kurs = rand_kur();
        this.gruppa = rand_group();
    }

    @Override
    public void i_am() {
        System.out.println("I am Student");
    }

    private String studentNumberOne(String raiting, int t) {
        String str;

        if(raiting.equals("NumberOne")) {
            str = "YES";
        } else str = "NO";

        System.out.println("Student number " + t);
        return str;
    }

    public String getFacultate() {
        return facultate;
    }

//    public int getKurs() {
//        return kurs;
//    }

    private String getGruppa() {
        return gruppa;
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

    private static String rand_group() {
        Random r = new Random();
        String[] name = {"11-ИВТ-1", "12-Эк", "14-К-2", "14-ФК-3"};
        int n = r.nextInt(4);
        return name[n];
    }


    //Вывод информации о студенте на экран
    public void print_student() {
        System.out.println("id: " + getId());
        System.out.println("Фамилия: " + getFamily());
        System.out.println("Имя: " + getFirst_name());
        System.out.println("Отчество: " + getSecond_name());
        System.out.println("Дата рождения: " + getDate());
        System.out.println("Адресс: " + getAdress());
        System.out.println("Телефон: " + getPhone());
        System.out.println("Факультет: " + getFacultate());
        System.out.println("Курс: " + this.kurs);
        System.out.println("Группа: " + getGruppa());
        System.out.println("--------------------------------------------------------------");
    }
    //Вывод на экран студентов заданого Факультетта и курса
    public void print_FakAndKurs(String s, int i) {
        if ((this.getFacultate().equals(s)) && (this.kurs == i))
            print_student();
    }
    //Вывод на экран студентов родифшихся после заданого года
    public void print_dr(int year2) {
        LocalDate localDate = this.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int year1 = localDate.getYear();
        if (year1 > year2)
            print_student();
    }
    //Вывод на экран студена, если он относиться к заданой группе
    public void print_grup(String s) {
        if (s.equals(this.getGruppa())){
            print_student();
        }
    }
}