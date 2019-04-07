package lesson2_dz;

public class Customer {
    private int id;
    private String family;
    private String first_name;
    private String second_name;
    private String adress;
    private long num_card;
    private long num_bank;

    public Customer(int id, String family,  String first_name, String second_name, String adress, long num_card, long num_bank) {
        this.id = id;
        this.family = family;
        this.first_name = first_name;
        this.second_name = second_name;
        this.adress = adress;
        this.num_card = num_card;
        this.num_bank = num_bank;
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

    public long getNum_card() {
        return num_card;
    }

    public long getNum_bank() {
        return num_bank;
    }

    //Вывод данных
    public void print_customer () {
        System.out.println(getId() + " " + getFamily() + " "+ getFirst_name() + " " + getSecond_name() + " " + getAdress() + " " + getNum_card() + " " + getNum_bank());
    }

    //Выводим данные, если они входят в заданный интервал
    public void print_sort_card(long p1, long p2) {
        if(getNum_card() > p1 && getNum_card() < p2)
            print_customer();
    }

}
