package lesson3_dz;

import java.util.Random;
import java.math.*;

public class Point  {
    private  double x;
    private double y;
    private  static double x_zero;
    private static double y_zero;
    private Complex com;
    private double direction;
    private int time = 0;
    private static double speed = 2;//round_double(rand_speed());
    private static double acceleration = 2;//round_double(rand_acceleration());

    public Point(double x, double y) {
        this.x = round_double(x);
        this.x_zero = round_double(x);
        this.y = round_double(y);
        this.y_zero = round_double(y);
    }


    public Point(double x, double y, double direction) {
        this.x = round_double(x);
        this.x_zero = round_double(x);
        this.y = round_double(y);
        this.y_zero = round_double(y);
        this.direction = round_double(direction);
    }

    public Point() {
        final int a = 100 - new Random().nextInt(100);
        this.x = (double) a;
        this.x_zero = this.x;
        final int b = new Random().nextInt(100);
        this.y = (double) b;
        this.y_zero = this.y;
        final int c = new Random().nextInt(360);
        this.direction = (double) c;
    }

    public Point(Complex com) {
        this.com = com;
    }

    public static double getSpeed() {
        return speed;
    }

    public static double getAcceleration() {
        return acceleration;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = round_double(x);
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = round_double(y);
    }

    public double getDirection() {
        return direction;
    }

    public void setDirection(double direction) {
        this.direction = direction;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    private static double rand_speed () {
        return new Random().nextDouble();
    }

    public static double rand_acceleration () {
        return new Random().nextDouble();
    }

    public double speed_calculation (double v) {
        v = v + getAcceleration() * getTime();
        return v;
    }


    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                ", direction=" + direction +
                ", time=" + time +
                '}';
    }

    public void point_in_time(int time_period) {
        setTime(time_period);
        setX(this.x_zero + way_forX());
        setY(this.y_zero + way_forY());
    }

    private final double  way_forX() {
        //System.out.println(getSpeed() + " " + getTime() + " " + getAcceleration() + " " + round_double(sinX(getDirection())));
        return (getSpeed() * getTime() + (Math.pow(getTime(), 2) * getAcceleration()) / 2) * round_double(sinX(getDirection()));
    }

    private  final double way_forY() {
        //System.out.println(getSpeed() + " " + getTime() + " " + getAcceleration()+ " " + round_double(cosX(getDirection())));
        return (getSpeed()  * getTime() +  (Math.pow(getTime(), 2) * getAcceleration()) / 2) * round_double(cosX(getDirection()));
    }

    public static double sinX (double n) {
        if(n == 180 )
            n = 0;
        return Math.sin(Math.toRadians(n));
    }

    public static double cosX (double n) {
        int m = 1;
        if(n == 90 || n == 270 )
            m = 0;
        return Math.cos(Math.toRadians(n)) * m;
    }

    public static double round_double(double d) {
        return  new BigDecimal(d).setScale(3, RoundingMode.UP).doubleValue();
    }

    public double distance_between_two_points (Point p) {
        return round_double(Math.sqrt(Math.pow(p.getX() - this.getX(), 2) + Math.pow(p.getY() - this.getY(), 2)));
    }
}
