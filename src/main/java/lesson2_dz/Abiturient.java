package lesson2_dz;

public class Abiturient {
    private int id;
    private String family;
    private String first_name;
    private String second_name;
    private String adress;
    private int phone;
    private int [] ratings;

    public Abiturient (int id, String family,  String first_name, String second_name, String adress, int phone, int [] ratings) {
        this.id = id;
        this.family = family;
        this.first_name = first_name;
        this.second_name = second_name;
        this.adress = adress;
        this.phone = phone;
        this. ratings = ratings;
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

    public int[] getRatings() {
        return ratings;
    }

    public int getSum() {
        int sum = 0;
        for(int i = 0; i < this.getRatings().length; i++)
            sum += getRatings()[i];
        return  sum;
    }

    public void print_abiturient () {
        String rat = "";
        for(int i = 0; i < this.getRatings().length; i++)
            rat += " " + Integer.toString(this.getRatings()[i]);
        System.out.println(getId() + "\t" + getFamily() + "\t"+ getFirst_name() + "\t" + getSecond_name() + "\t" + getAdress() + "\t" + getPhone() + "\t" + rat);
    }

    public void print_sum (int sum) {
        if(this.getSum() > sum)
            print_abiturient();

    }

    public void print_neud () {
        for(int i = 0; i < this.getRatings().length; i++) {
            if(this.getRatings()[i] < 3)
                print_abiturient();
        }
    }

}
