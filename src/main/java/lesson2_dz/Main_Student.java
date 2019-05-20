package lesson2_dz;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main_Student {
    public static void main(String[] args) {
//        System.out.println(rand_kur());
        //Создаенм масив объектов
        Student[] ngtu = new Student[10];

        //Забиваем каждый объект рандомными данными
        for(int i = 0; i < ngtu.length; i++){
            ngtu[i] = new Student();
        }

        //Выводим созданный массив объектов
        System.out.println("========================================================");
        System.out.println("Все студенты");
        System.out.println("========================================================");
        for(int i = 0; i < ngtu.length; i++){
            ngtu[i].print_student();
        }

        System.out.println("========================================================");
        System.out.println("По факультету и курсу");
        System.out.println("========================================================");
        for(int i = 0; i < ngtu.length; i++){
            ngtu[i].print_FakAndKurs("Экономический", 2);
        }

        System.out.println("========================================================");
        System.out.println("Год рождения больше установленной ");
        System.out.println("========================================================");
        for(int i = 0; i < ngtu.length; i++){
            ngtu[i].print_dr(1997);
        }

        String[] gr = {"11-ИВТ-1", "12-Эк", "14-К-2", "14-ФК-3"};
        System.out.println("========================================================");
        System.out.println("По группам");
        System.out.println("========================================================");
        for(int j = 0; j < gr.length; j++){
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("Группа " + gr[j]);
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            for(int i = 0; i < ngtu.length; i++){
                ngtu[i].print_grup(gr[j]);
            }
        }


    }
    //Методы по забиванию рандомными данными


}
