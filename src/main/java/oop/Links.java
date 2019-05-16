package oop;

public class Links {
    public static void main(String[] args) {
        Link A = new Link();

        A.number = 100;
        System.out.println(A.number);

        Link B = A;
        System.out.println(B.number);

        B.number = 200;
        System.out.println(A.number);

        func(A);
        System.out.println(A.number);
    }

    public static void func(Link link) {
        link.number = 300;
    }
}
