package ws8;

import java.io.Serializable;
import java.util.Scanner;

public class ListStudent implements Serializable {

    private String name;
    private int age;
    private float mark;


 

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getMark() {
        return mark;
    }

    public void setMark(float mark) {
        this.mark = mark;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "List Student : " + "\n" + "Name : " + name + "  " + "Age: " + age + "   " + "Mark : " + mark;
    }

}