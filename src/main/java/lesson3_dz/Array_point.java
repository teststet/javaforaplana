package lesson3_dz;

public class Array_point {
    public static void main(String[] args) {
        Point[] arr = new Point[2];
        for(int i = 0; i < arr.length - 1; i++) {
            arr[i] = new Point(1, 1, 180);
            System.out.println(arr[i].toString());
        }

        arr[1] = new Point(2, 2, 90);
        System.out.println(arr[1].toString());
        System.out.println(arr[1].getSpeed() + " " + arr[1].getAcceleration());

        double S;
        for(int i = 0; i < arr.length -1; i ++) {
            arr[i].point_in_time(10);
            arr[i+1].point_in_time(10);
            S = arr[i].distance_between_two_points(arr[i+1]);
            System.out.println(arr[i].toString());
            System.out.println(arr[i + 1].toString());
            System.out.println("Растояние между точками = " + S);
        }


    }




}
