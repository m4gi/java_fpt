/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author DAI PHUC
 */
public class Student implements Serializable
{
    private String studentID;
    private String lastName;
    private String firstName;
    private String gender;
    private int phone;

    public Student()
    {
    }

    public Student(String studentID, String lastName, String firstName, String gender, int phone)
    {
        this.studentID = studentID;
        this.lastName = lastName;
        this.firstName = firstName;
        this.gender = gender;
        this.phone = phone;
    }

    public String getStudentID()
    {
        return studentID;
    }

    public void setStudentID(String studentID)
    {
        this.studentID = studentID;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getGender()
    {
        return gender;
    }

    public void setGender(String gender)
    {
        this.gender = gender;
    }

    public int getPhone()
    {
        return phone;
    }

    public void setPhone(int phone)
    {
        this.phone = phone;
    }

    @Override
    public String toString()
    {
        return "Student{" + "studentID=" + studentID + ", lastName=" + lastName + ", firstName=" + firstName + ", gender=" + gender + ", phone=" + phone + '}';
    }
    
    public Object[] toArray()
    {
        return new Object[]{studentID, lastName, firstName, gender, phone};
    }
}
