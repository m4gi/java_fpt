package java7;
public class Technician extends Employee{
protected String work;
public static final  double yearReward=50000;
public String getWork() {
	return work;
}
public void setWork(String work) {
	System.out.print("Enter work:");
	work=sc.next();
	this.work = work;
}

public double reward() {
	return yearReward*NumberOfYear();
}

public double salary() {
	return getSalaryCoefficient()* basicSalary + yearSeniorityAllowance;
}

public Technician input() {
	Technician t = new Technician();
	t.setEmployeeID(employeeID);
	t.setFullName(fullName);
	t.setSalaryCoefficient(salaryCoefficient);
	t.setGender(gender);
	t.setWork(work);
	t.setWorkStartDate(workStartDate);
	return t;
}
@Override
public String toString() {
	return ""+ getEmployeeID() + "|" + getFullName()
	+ "|" + getSalaryCoefficient() + "|" + isGender() + "|" +getWork() + "|" + reward() + "|"
			+ salary()
			+ "|" + getWorkStartDate();
}

}
