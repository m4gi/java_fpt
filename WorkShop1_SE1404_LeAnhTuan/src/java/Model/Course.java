/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Le Anh Tuan
 */
public class Course {

    private String Course_ID;
    private String Subject;
    private String Lecturer;
    private String Schedule;

    public Course(String Course_ID, String Subject, String Lecturer, String Schedule) {
        this.Course_ID = Course_ID;
        this.Subject = Subject;
        this.Lecturer = Lecturer;
        this.Schedule = Schedule;
    }

    public Course() {
    }

    public String getCourse_ID() {
        return Course_ID;
    }

    public void setCourse_ID(String Course_ID) {
        this.Course_ID = Course_ID;
    }

    public String getSubject() {
        return Subject;
    }

    public void setSubject(String Subject) {
        this.Subject = Subject;
    }

    public String getLecturer() {
        return Lecturer;
    }

    public void setLecturer(String Lecturer) {
        this.Lecturer = Lecturer;
    }

    public String getSchedule() {
        return Schedule;
    }

    public void setSchedule(String Schedule) {
        this.Schedule = Schedule;
    }
    
}
