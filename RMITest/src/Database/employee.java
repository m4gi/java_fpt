package Database;

import java.io.Serializable;

public class employee implements Serializable{

    String Emp_ID,
            Last_Name,
            Fist_Name,
            Gender,
            Email;

    public employee() {
    }

    public employee(String Emp_ID, String Last_Name, String Fist_Name, String Gender, String Email) {
        this.Emp_ID = Emp_ID;
        this.Last_Name = Last_Name;
        this.Fist_Name = Fist_Name;
        this.Gender = Gender;
        this.Email = Email;
    }

    public String getEmp_ID() {
        return Emp_ID;
    }

    public void setEmp_ID(String Emp_ID) {
        this.Emp_ID = Emp_ID;
    }

    public String getLast_Name() {
        return Last_Name;
    }

    public void setLast_Name(String Last_Name) {
        this.Last_Name = Last_Name;
    }

    public String getFist_Name() {
        return Fist_Name;
    }

    public void setFist_Name(String Fist_Name) {
        this.Fist_Name = Fist_Name;
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
        return "employee{" + "Emp_ID=" + Emp_ID + ", Last_Name=" + Last_Name + ", Fist_Name=" + Fist_Name + ", Gender=" + Gender + ", Email=" + Email + '}';
    }
    
    
}
