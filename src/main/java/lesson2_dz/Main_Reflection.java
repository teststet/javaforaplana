package lesson2_dz;

/*
Поолезная ссылка по теме рефлексия
https://javarush.ru/groups/posts/513-reflection-api-refleksija-temnaja-storona-java
 */

import java.lang.reflect.Field;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.SQLOutput;

public class Main_Reflection {

    public static void main(String[] args) {

//       Abiturient abiturient = new Abiturient();
//       Customer customer = new Customer();
//       Patient patient = new Patient();
       Student student = new Student();

        student.print_student();
        int k  = 0;

        //get and set field
        try {
           Field field = student.getClass().getDeclaredField("kurs");
           field.setAccessible(true);
           //get field
           k = (int) field.get(student);
           //set field
           //field.set(student,  5);

       } catch (NoSuchFieldException | IllegalAccessException e) {
           e.printStackTrace();
       }

        System.out.println("Student kurs = " + k);
        //student.print_student();
        System.out.println("--------------------------------------------------------------");
        System.out.println("Доступные поля переменных " + student.getClass().getFields().length);
        System.out.println("Доступные методы " + student.getClass().getMethods().length);
        System.out.println("--------------------------------------------------------------");

        // methods
        try {
            //not argument
            Method method = student.getClass().getDeclaredMethod("rand_group");
            method.setAccessible(true);
            System.out.println("Группа " + method.invoke(student));

            //argument
            method = student.getClass().getDeclaredMethod("studentNumberOne", String.class, int.class);
            method.setAccessible(true);
            System.out.println("Student number one? :  " + method.invoke(student,  "No", 2));
        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
            e.printStackTrace();
        }

        System.out.println("--------------------------------------------------------------");
        //Выводим Абстрактный метод абстрактного класса
       try {
            for (int i = 0; i < 4; i++) {
                String className = "";
                switch (i) {
                    case 0 : className = "Abiturient"; break;
                    case 1 : className = "Customer"; break;
                    case 2 : className = "Patient"; break;
                    case 3 : className = "Student"; break;

                }

                Class cl = Class.forName("lesson2_dz." + className);

                //constructor
                Constructor cons = cl.getConstructor();
                Object instance = cons.newInstance();
                Method method = instance.getClass().getMethod("i_am");
                method.invoke(instance);

                method = instance.getClass().getMethod("getFamily");
                System.out.println("Family name " + className + " is " +  method.invoke(instance));


            }
       } catch ( ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
        e.printStackTrace();
       }
    }
}
