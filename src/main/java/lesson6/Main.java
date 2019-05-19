package lesson6;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {

        White w = new White();
        Black b = new Black();


        // fields
        System.out.println(b.getClass().getFields().length);

        String lastNameOfBlackClass;
        try {
            // get field
            b.setLastName("qwerty");
            Field field = b.getClass().getDeclaredField("lastName");
            field.setAccessible(true);
            lastNameOfBlackClass = field.get(b).toString();
            System.out.println(lastNameOfBlackClass);


            //set field
            field.set(b, "asdfgh");
            b.wichLastName();


        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }


        // methods
        System.out.println(b.getClass().getMethods().length);

        try {

            //get method
            Method method = w.getClass().getDeclaredMethod("sayAnswer");
            method.setAccessible(true);
            method.invoke(w);


        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }

        //classes
        try {
            for (int i = 0; i < 2; i++) {
                String className = i == 1 ? "Black" : "White";
                if (i == 0){
                    className = "Black";
                } else {
                    className = "White";
                }
                Class cl = Class.forName("lesson6." + className);

                //constructor
                Constructor cons = cl.getConstructor();
                Object instance = cons.newInstance();
                Method method = instance.getClass().getDeclaredMethod("sayMyName");
                method.invoke(instance);
            }

        } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}