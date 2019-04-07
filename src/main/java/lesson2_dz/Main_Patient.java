package lesson2_dz;

import java.util.Random;

//Подключаем класс студент, что использовать методы рандомизации
import static lesson2_dz.Main_Student.*;

public class Main_Patient {
    public static void main(String[] args) {
        //Создаенм масив объектов
        Patient[] med = new Patient[5];

        //Забиваем каждый объект рандомными данными
        for(int i = 0; i < med.length; i++){
            med[i] = new Patient(i,rand_fam(),rand_firstName(),rand_secondName(),rand_adr(), rand_tel(), rand_medcard(),rand_diagnoz());
        }

        //Выводим созданный массив объектов
        for(int i = 0; i < med.length; i++)
            med[i].print_patient();

        //Выводим список пациентов по диагнозу
        String[] d = {"Волчанка", "ОРВИ", "Перелом", "Ушиб"};
        System.out.println("========================================================");
        System.out.println("По диагнозу");
        System.out.println("========================================================");
        for(int j = 0; j < d.length; j++){
            System.out.println("Диагноз: " + d[j]);
            for(int i = 0; i < med.length; i++){
                med[i].print_podiagnozu(d[j]);
            }
        }

        //Выводим список пациентов согласно заданому интервалу
        System.out.println("========================================================");
        System.out.println("По медкарте в интервале чисел");
        System.out.println("========================================================");
        for(int i = 0; i < med.length; i++)
            med[i].print_pomedcard(2000,6000);
    }

    public static int rand_medcard() {
        Random r = new Random();
        int n = r.nextInt(9000) + 1000;
        return n;
    }

    public static String rand_diagnoz() {
        Random r = new Random();
        String[] name = {"Волчанка", "ОРВИ", "Перелом", "Ушиб"};
        int n = r.nextInt(4);
        return name[n];
    }
}
