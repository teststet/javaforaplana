package lesson3_dz;

public class Triangle_Main {
    public static void main(String[] args) {
        Triangle[] t = new Triangle[2];
        t[0] = new Triangle(3, 4, 3);
        System.out.println(t[0].toString());
        System.out.println(t[0].perimeter());
        System.out.println(t[0].square());
    }
}
