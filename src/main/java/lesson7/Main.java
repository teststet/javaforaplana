package lesson7;

public class Main {

    public static void main(String[] args) {

        //buffer
        MyBuffer b = new MyBuffer("E:\\test01Java\\src\\main\\java\\lesson7\\Text.txt");
        String text = b.getFileText();
        System.out.println(text);

        b.setFileText(text + "\n12");
        b.setFileText(text + "\n13");
        b.setFileText(text + "\n14");
    }
}
