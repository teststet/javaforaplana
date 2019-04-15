package lesson2_dz;

import java.text.ParseException;
import java.util.Random;

public class Abiturient extends Human{

    private int [] ratings;

    public Abiturient () throws ParseException {
        super();
        this. ratings = rand_retings();
    }

    public static int[] rand_retings() {
        Random r = new Random();
        int[] n = new int[3];
        for(int i = 0; i < n.length; i++)
            n[i] = r.nextInt(5) + 1;
        return n;
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
            this.print_abiturient();

    }

    public void print_neud () {
        for(int i = 0; i < this.getRatings().length; i++) {
            if(this.getRatings()[i] < 3)
                this.print_abiturient();
        }
    }
    public void print_halfSum () {
        if(this.getSum() == ((5*this.getRatings().length) / 2))
            this.print_abiturient();
    }
}
