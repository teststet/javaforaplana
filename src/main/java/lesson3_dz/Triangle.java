package lesson3_dz;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Triangle {

    int a_side;
    int b_side;
    int c_side;

    public Triangle (int a_side, int b_side, int c_side) {
        if(((a_side + b_side) > c_side) && ((a_side + c_side) > b_side)
                && ((b_side + c_side) > a_side)){
            this.a_side = a_side;
            this.b_side = b_side;
            this.c_side = c_side;

        }
        else
            System.out.println("Не существует треугольника с такими сторонами");
    }

    public int getA_side() {
        return a_side;
    }

    public void setA_side(int a_side) {
        this.a_side = a_side;
    }

    public int getB_side() {
        return b_side;
    }

    public void setB_side(int b_side) {
        this.b_side = b_side;
    }

    public int getC_side() {
        return c_side;
    }

    public void setC_side(int c_side) {
        this.c_side = c_side;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a_side=" + a_side +
                ", b_side=" + b_side +
                ", c_side=" + c_side +
                '}';
    }

    public int perimeter () {
        return this.a_side + this.b_side + this.c_side;
    }

    public double square () {
        double p = perimeter() / 2;
        //System.out.println(p);
        double s = Math.sqrt(p * (p - a_side) * (p - b_side) * (p - c_side));
        return new BigDecimal(s).setScale(3, RoundingMode.UP).doubleValue();
    }

    public boolean true_triangle() {
        return ((getA_side() + getB_side()) > getC_side()) && ((getA_side() + getC_side()) > getB_side())
                && ((getB_side() + getC_side()) > getA_side());
    }
}