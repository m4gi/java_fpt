/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FIle;

/**
 *
 * @author Le Tuan
 */
public class Student {

    String Name;
    String ID;
    String Semester;
    String Course;

    public Student() {
    }

    public Student(String Name, String ID, String Semester, String Course) {
        this.Name = Name;
        this.ID = ID;
        this.Semester = Semester;
        this.Course = Course;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getSemester() {
        return Semester;
    }

    public void setSemester(String Semester) {
        this.Semester = Semester;
    }

    public String getCourse() {
        return Course;
    }

    public void setCourse(String Course) {
        this.Course = Course;
    }

    @Override
    public String toString() {
        return ID + "\t|\t" + Name + "\t|\t" + Semester + "\t|\t" + Course;
    }

}
