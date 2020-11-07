import java.awt.BorderLayout;
import java.util.Scanner;

public class ABC {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Nhap so nguyen: ");
        String a = scanner.next();
        System.out.println(a);
        
    }
}

abstract class Animal {

    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Animal(String name) {
        this.name = name;
        this.age = 10;
    }

    Animal() {
        this.name = "Animal";
        this.age = 10;
    }

    void hello() {
        System.out.println("Toi la " + this.name + " chao cac ban.");
    }

    public void showInfo() {
        System.out.println("Ten: " + name + ", tuoi: " + age);
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    abstract public void abc();
}

class Dog extends Animal {

    private String chu;

    Dog(String chu) {
        super();
        this.chu = chu;
    }

    Dog(String name, int age, String chu) {
        this.name = name;
        this.age = age;
        this.chu = chu;

    }

    @Override
    public void hello() {
        System.out.println("Toi la " + this.name + " cua " + this.chu + " chao cac ban.");
    }

    @Override
    public void abc() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

abstract class Hinh {

    abstract double getSize();

    abstract double getArea();
}

class HCN extends Hinh {

    public double height;
    public double width;

    @Override
    double getSize() {
        return height * width;
    }

    @Override
    double getArea() {
        return 2 * (height + width);
    }

}

class HinhTron extends Hinh {

    public double radius;

    @Override
    double getSize() {
        return 3.14 * radius * radius;
    }

    @Override
    double getArea() {
        return 2 * 3.14 * radius;
    }

}
