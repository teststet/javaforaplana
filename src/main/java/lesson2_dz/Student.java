package lesson2_dz;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class Student {
    private int id;
    private String family;
    private String first_name;
    private String second_name;
    private Date date;
    private String adress;
    private int phone;
    private String facultate;
    private int kurs;
    private String gruppa;

    public Student(int id, String family, String first_name, String second_name, Date date, String adress, int phone, String facultate, int kurs, String gruppa) {
        this.id = id;
        this.family = family;
        this.first_name = first_name;
        this.second_name = second_name;
        this.date = date;
        this.adress = adress;
        this.phone = phone;
        this.facultate = facultate;
        this.kurs = kurs;
        this.gruppa = gruppa;
    }

    public Student(int i, String rand_fam, String rand_firstName, String rand_secondName, String rand_adr, long rand_card, long rand_bank) {
    }

    public void setId() {
        this.id = id;
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

    public String getFacultate() {
        return facultate;
    }

    public int getKurs() {
        return kurs;
    }

    public String getGruppa() {
        return gruppa;
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
        System.out.println("Курс: " + getKurs());
        System.out.println("Группа: " + getGruppa());
        System.out.println("--------------------------------------------------------------");
    }
    //Вывод на экран студентов заданого Факультетта и курса
    public void print_FakAndKurs(String s, int i) {
        if ((this.getFacultate().equals(s)) && (this.getKurs() == i))
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