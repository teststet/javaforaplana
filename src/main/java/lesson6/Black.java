package lesson6;

public class Black extends ParenClass {

    public void sayMyName () {
        System.out.println("Heisenberg");
    }

    public String publicString;

    private String lastName;

    public void setLastName (String lastName) {
        this.lastName = lastName;
    }

    public  void wichLastName() {
        System.out.println(lastName);
    }

    public Black() {}

    public Black(String lastName, String publicString) {
        this.lastName = lastName;
        this.publicString = publicString;
    }
}
