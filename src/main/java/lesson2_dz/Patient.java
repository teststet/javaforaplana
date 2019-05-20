package lesson2_dz;

import java.util.Random;

public class Patient extends Human{

    private int num_medcard;
    private String diagnoz;

    public Patient()  {
        super();
        this.num_medcard = rand_medcard();
        this.diagnoz = rand_diagnoz();
    }

    @Override
    public void i_am() {
        System.out.println("I am Patient");
    }

    public static int rand_medcard() {
        Random r = new Random();
        int n = r.nextInt(9000) + 1000;
        return n;
    }

    public static String rand_diagnoz() {
        Random r = new Random();
        String[] name = {"Волчанка", "ОРВИ", "Перелом", "Ушиб"};
        int n = r.nextInt(4);
        return name[n];
    }

    public int getNum_medcard() {
        return num_medcard;
    }

    public String getDiagnoz() {
        return diagnoz;
    }

    //Выводим данные
    public void print_patient () {
        System.out.println(getId() + " " + getFamily() + " "+ getFirst_name() + " " + getSecond_name() + " " + getAdress() + " " + getPhone() + " " + getNum_medcard() + " " + getDiagnoz());
    }

    //Выводим данные, если они соответвуют диагнозу
    public void print_podiagnozu (String s) {
        if (s.equals(getDiagnoz()))
            print_patient();
    }

    //Выводим данные, если они входят в заданный интервал
    public void print_pomedcard(int p1, int p2) {
        if(getNum_medcard() > p1 && getNum_medcard() < p2)
            print_patient();
    }

}
