package lesson7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyScanner extends  FileWork {

    public MyScanner(String filePatch) { this.filePatch = filePatch; }

    @Override
    public String getFileText() {

        String res = "";

        try {
            File file = new File(filePatch);
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                res += sc.nextLine() + "\n";
            }
            sc.close();
        }catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }

        return res;
    }

    public int getInt() {
        int i = 0;
        try {
            Scanner sc = new Scanner(new File(filePatch));
            while(sc.hasNextInt()){
                i = sc.nextInt();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return i;
    }

    @Override
    public void setFileText(String text) {
        System.out.println("Scanner is for reading ONLY!!!!!!");
    }
}
