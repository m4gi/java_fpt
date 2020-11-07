/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RMI_PRJ321;

import java.io.Serializable;

/**
 *
 * @author Magi
 */
public class Employee implements Serializable {

    private static final long serialVersionUID = 1L;
    protected String Emp_Id;
    protected String Last_Name;
    protected String First_Name;
    protected String Gender;
    protected String Email;

    public Employee(String Emp_Id, String Last_Name, String First_Name, String Gender, String Email) {
        this.Emp_Id = Emp_Id;
        this.Last_Name = Last_Name;
        this.First_Name = First_Name;
        this.Gender = Gender;
        this.Email = Email;
    }

    public Employee() {
    }

    public String getEmp_Id() {
        return Emp_Id;
    }

    public void setEmp_Id(String Emp_Id) {
        this.Emp_Id = Emp_Id;
    }

    public String getLast_Name() {
        return Last_Name;
    }

    public void setLast_Name(String Last_Name) {
        this.Last_Name = Last_Name;
    }

    public String getFirst_Name() {
        return First_Name;
    }

    public void setFirst_Name(String First_Name) {
        this.First_Name = First_Name;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    @Override
    public String toString() {
        return "Employee{" + "Emp_Id=" + Emp_Id + ", Last_Name=" + Last_Name + ", First_Name=" + First_Name + ", Gender=" + Gender + ", Email=" + Email + '}';
    }

}
