package lesson7;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //buffer
//        MyBuffer b = new MyBuffer("E:\\test01Java\\src\\main\\java\\lesson7\\Text.txt");
//        String text = b.getFileText();
//        System.out.println(text);

        //Создаем объекты класса MyReader
        String adress = "E:\\test01Java\\src\\main\\java\\lesson7\\";
        String adress2 = "C:\\aplana-test\\javaforaplana\\src\\main\\java\\lesson7\\";
        //Файл для считывания
        MyReader outputfile = new MyReader(adress2 + "Text.txt");
        //Файл для записи
        MyReader inputfile = new MyReader(adress2 + "Text1.txt");

        //Создаем объекты класса Test01
        Test01 test = new Test01();

        //Результат работы методов класса Test01 добавляем в ArrayList
        ArrayList<String> list = new ArrayList<String>();
        //TODO Добавить все методы
        list.add(String.valueOf(test.sum(5, 6)));
        list.add(String.valueOf(test.firstTask(10,8,15)));
        list.add(String.valueOf(test.sum(5, 6)));
        list.add(String.valueOf(test.firstTask(10,8,15)));

        //Создаем строку, куда добавим все переменые списка
        String s = "";

        for(int i = 0; i < list.size() ; i++) {
            s += sPlusS(list.get(i), i);
        }

        //s += sPlusS(String.valueOf(test.firstTask(4, 5, 6)));

        inputfile.setFileText(s);

    }

    //Метод для складывания строк
    public static String sPlusS (String z, int a) {
        return  "Результат Задачи № " +  a +  " :\n"  + z + "\n";
    }

}
