package lesson7;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MyFile extends  FileWork{

    public MyFile(String filePatch) {
        this.filePatch = filePatch;
    }


    @Override
    public String getFileText() {
        String res = "";

        try {
            FileReader fr = new FileReader(filePatch);
            //for reader we need to use Scanner
            Scanner scan = new Scanner(fr);
            while (scan.hasNextLine()) {
                res += scan.nextLine() + "\n";
            }

            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return res;
    }

    @Override
    public void setFileText(String text) {
        try {
            FileWriter fileWriter = new FileWriter(filePatch);
            fileWriter.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
