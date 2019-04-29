package lesson3_dz;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Triangle {

    int a_side;
    int b_side;
    int c_side;

    //В конструкторе есть проверка на существование треугольника
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
    //Вершины треугольника класс Точка, для определения растояния между точками используется метод по высчитыванию растояния
    //между двумя точками
    public Triangle (Point a, Point b, Point c) {
        if(((a.distance_between_two_points(b) + b.distance_between_two_points(c)) > c.distance_between_two_points(a))
                && ((b.distance_between_two_points(b) + c.distance_between_two_points(c)) > a.distance_between_two_points(a))
                && ((a.distance_between_two_points(b) + c.distance_between_two_points(c)) > b.distance_between_two_points(a))){
            this.a_side = (int) a.distance_between_two_points(b);
            this.b_side = (int) b.distance_between_two_points(c);
            this.c_side = (int) c.distance_between_two_points(a);
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

    //Площадь вычисляется по формуле Герона
    public double square () {
        double p = perimeter() / 2;
        //System.out.println(p);
        double s = Math.sqrt(p * (p - a_side) * (p - b_side) * (p - c_side));
        return new BigDecimal(s).setScale(3, RoundingMode.UP).doubleValue();
    }
    // Метод по определению существования треугольника с задаными сторонами
    public boolean true_triangle() {
        return ((getA_side() + getB_side()) > getC_side()) && ((getA_side() + getC_side()) > getB_side())
                && ((getB_side() + getC_side()) > getA_side());
    }

    //Метод по определению типа треугольника
    public String type_triangle() {
        String type;
        if (getA_side() == getB_side() && getB_side() == getC_side() && getA_side() == getC_side())
            type = "равносторонний"; //equilateral
        else if (getA_side() == getB_side() || getB_side() == getC_side() || getA_side() == getC_side())
            type = "равнобедренный"; //isosceles
        else if((Math.sqrt(Math.pow(getA_side(), 2) + Math.pow(getB_side(), 2) )) == getC_side()
                || (Math.sqrt(Math.pow(getB_side(), 2) + Math.pow(getC_side(), 2) )) == getA_side()
                || (Math.sqrt(Math.pow(getA_side(), 2) + Math.pow(getC_side(), 2) )) == getB_side())
            type = "прямоугольный"; //rectangular
        else type = "произвольный"; //arbitrary
        return type;
    }

}