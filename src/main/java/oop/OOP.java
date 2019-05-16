package oop;

public class OOP {

    public static void main(String[] args) {
//        Animal dog = new Dog();
//        Animal cat = new Cat();
//
//        cat.setName("Mary");
//        dog.setName("Gustav");
//
//        cat.sayName();
//        dog.sayName();
//
//        cat.say();
//        dog.say();

        int first[];
        int second[];

        first = new int[10];
        second = first;

        for(int i = 0; i < first.length; i ++) {
            first[i] = i;
        }

        System.out.println("First");
        print_arr(first);

        System.out.println("\nSecond");
        print_arr(second);

        second[3] = 100;

        System.out.println("\nFirst");
        print_arr(first);
        System.out.println("\nSecond");
        print_arr(second);

    }

    public static void print_arr(int arr[]) {
        for(int i = 0; i < arr.length; i ++) {
            System.out.println(arr[i]);
        }
    }
}
