package lesson7;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class MyReader extends  FileWork{

    public MyReader (String filePatch) {this.filePatch = filePatch; }

    @Override
    public String getFileText() {
        String res = "";
        try {
            res = new String(Files.readAllBytes(Paths.get(filePatch)));
        }catch (IOException e) {
            e.printStackTrace();
        }

        return  res;
    }

    @Override
    public void setFileText(String text) {
        try {
            FileOutputStream fos = new FileOutputStream(filePatch);
            fos.write(text.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //TODO Добавить метод для считывания нужной строки
}
