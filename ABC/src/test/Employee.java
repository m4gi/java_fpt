package test;

import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public abstract class Employee implements IEmployment{
	Scanner sc = new Scanner(System.in);
		protected String employeeID,fullName;
		protected double salaryCoefficient;
		protected Date workStartDate;
		protected boolean gender;
		public static final double basicSalary = 1490000 ;
		public static final double yearSeniorityAllowance =100000;
		public String getEmployeeID() {
			return employeeID;
		}
		public void setEmployeeID(String employeeID) {
			System.out.print("Enter ID:");
			employeeID = sc.next();
			this.employeeID = employeeID;
		}
		
		
		public String getFullName() {
			return fullName;
		}
		
		
		public void setFullName(String fullName) {
			System.out.print("Enter fullName:");
			fullName = sc.next();
			this.fullName = fullName;
		}
		
		
		public double getSalaryCoefficient() {
			return salaryCoefficient;
		}
		
		
		public void setSalaryCoefficient(double salaryCoefficient) {
			System.out.print("Enter salaryCoefficient:");
			salaryCoefficient = sc.nextDouble();
			this.salaryCoefficient = salaryCoefficient;
		}
		public boolean isGender() {
			return gender;
		}
		public void setGender(boolean gender) {
			System.out.print("Enter gender(male=true):");
	    	gender=sc.nextBoolean();
			this.gender = gender;
		}
		
		
		
		public Date getWorkStartDate() {
			return workStartDate;
		}
		public void setWorkStartDate(Date workStartDate) {
			String s;
			SimpleDateFormat df= new SimpleDateFormat("dd-MM-yyy");
			System.out.print("enter work start date:");
			s=sc.next();
			try {
				workStartDate=df.parse(s);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			this.workStartDate=workStartDate;
		}
		
		public long NumberOfYear() {
			return Calendar.getInstance().getTime().getTime()
			-this.workStartDate.getTime()/1000/60/60/24/365;
		}
		
		public abstract double reward();
		
		
}
