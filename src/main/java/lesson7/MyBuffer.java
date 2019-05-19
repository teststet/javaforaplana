package lesson7;

import java.io.*;

public class MyBuffer extends FileWork {

    public MyBuffer(String filePatch) {
        this.filePatch = filePatch;
    }

    @Override
    public String getFileText() {

        try (BufferedReader br = new BufferedReader((new FileReader(new File(filePatch))))) {
            String st;
            String res = "";
            while (((st = br.readLine()) != null)) {
                res += st + "\n";
            }

            return  res;

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void setFileText(String text) {
        try {
            File file = new File(filePatch);
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fileWriter);

//            for (String s : text.split("\n")) {
//                bw.write(s + "\n");
//            }
            bw.write(text);
            bw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
