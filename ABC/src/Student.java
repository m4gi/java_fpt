
import java.util.Calendar;
import java.util.Date;

public class Student {

    private String name, studentID, address, major;
    private Date birthDate;

    @Override
    public String toString() {
        return "Student:\n" + "Name: " + name + "\nStudentID: " + studentID + "\nBirthDate: " + birthDate
                + "\nAddress: " + address + "\nMajor: " + major;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setstudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(int iYear, int iMonth, int iDay) {
        Calendar cal = Calendar.getInstance();
        cal.set(iYear, iMonth, iDay);
        this.birthDate = cal.getTime();
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Le Anh Tuan");
        student.setstudentID("DE140280");
        student.setBirthDate(2000, Calendar.SEPTEMBER, 7);
        student.setAddress("Quang Binh Province");
        student.setMajor("Major 2 in FPT University");
        System.out.println(student);
    }

}
