package lesson2_dz;

public class Patient {
    private int id;
    private String family;
    private String first_name;
    private String second_name;
    private String adress;
    private int phone;
    private int num_medcard;
    private String diagnoz;

    public Patient(int id, String family, String first_name, String second_name, String adress, int phone, int num_medcard, String diagnoz) {
        this.id = id;
        this.family = family;
        this.first_name = first_name;
        this.second_name = second_name;
        this.adress = adress;
        this.phone = phone;
        this.num_medcard = num_medcard;
        this.diagnoz = diagnoz;
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

    public String getAdress() {
        return adress;
    }

    public int getPhone() {
        return phone;
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
