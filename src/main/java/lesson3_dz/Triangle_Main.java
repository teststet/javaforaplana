package lesson3_dz;

public class Triangle_Main {
    public static void main(String[] args) {
        Triangle[] t = new Triangle[3];
        t[0] = new Triangle(3, 3, 3);
        t[1] = new Triangle(3, 4, 5);
        t[2] = new Triangle(3, 4, 3);
        System.out.println(t[0].toString());
        System.out.println(t[0].perimeter());
        System.out.println(t[0].square());
        System.out.println(t[0].type_triangle());
        type(t);
        mimmaxSq(t);


    }
    public  static void mimmaxSq (Triangle[] triangle) {
        System.out.println("\nМаксимальная и минимальная площадь треугольников");
        System.out.println("Площадь равносторонних треугольников: min = " + minSq(triangle,  "равносторонний") + "\tmax = " + maxSq(triangle, "равносторонний"));
        System.out.println("Площадь равнобедренных треугольников: min = " + minSq(triangle, "равнобедренный") + "\tmax = " + maxSq(triangle, "равнобедренный"));
        System.out.println("Площадь прямоугольных треугольников: min = " + minSq(triangle, "прямоугольный") + "\tmax = " + maxSq(triangle, "прямоугольный"));
        System.out.println("Площадь произвольных треугольников: min = " + minSq(triangle, "произвольный") + "\tmax = " + maxSq(triangle, "произвольный"));
    }

    public static double minSq (Triangle[] triangle, String str) {
        int i = 0;
        double minSq = 0;
        for(; i < triangle.length; i++) {
            if (triangle[i].type_triangle().equals(str)) {
                minSq = triangle[i].square();
                break;
            }
        }
        for(; i < triangle.length; i++) {
            if(triangle[i].type_triangle().equals(str)) {
                minSq = minSq > triangle[i].square() ?  triangle[i].square() : minSq;
            }

        }
        return minSq;
    }

    public static double maxSq (Triangle[] triangle, String str) {
        double maxSq = 0;
        for(int i = 0; i < triangle.length; i++) {
            if(triangle[i].type_triangle().equals(str)) {
                maxSq = maxSq < triangle[i].square() ?  triangle[i].square() : maxSq;
            }

        }
        return maxSq;
    }
    //Подсчет по количеству типов треугольников
    public static void type(Triangle[] triangle) {
        int equilateral = 0;
        int isosceles = 0;
        int rectangular = 0;
        int arbitrary = 0;

        for (int i = 0; i < triangle.length; i++){
            if(triangle[i].type_triangle().equals("равносторонний")) equilateral++;
            else if (triangle[i].type_triangle().equals("равнобедренный")) isosceles++;
            else if (triangle[i].type_triangle().equals("прямоугольный")) rectangular++;
            else arbitrary++;
        }
        System.out.println("\nКоличество треугольников по типу");
        System.out.println("Равносторонних треугольников = " + equilateral);
        System.out.println("Равнобедренных треугольников = " + isosceles);
        System.out.println("Прямоугольных треугольников = " + rectangular);
        System.out.println("Произвольных треугольников = " + arbitrary);
    }
}
