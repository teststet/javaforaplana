package oop;

public class Animal {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayName () {
        System.out.println("My name is " + this.name);
    }

    public void say () {
        System.out.print(this.name + " say ");
    }

}
