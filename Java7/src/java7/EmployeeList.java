package java7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeList {
	private ArrayList<Employee> list = new ArrayList<>();
	private static int choose;
	private static String ID, fullName;
	private static Date day;

	Scanner sc = new Scanner(System.in);

	public ArrayList<Employee> getList() {
		return list;

	}

	public Employee getEmployees(int i) {
		return list.get(i);
	}

	public void addEmployee() {
		int num;
		do {
			System.out.println("1.add manager");
			System.out.println("2.add Technician");
			System.out.println("3.Eixt");
			num = sc.nextInt();
			switch (num) {
				case 1: {
					Manager m = new Manager();
					list.add(m.input());
					break;
				}
				case 2: {
					Technician t = new Technician();
					list.add(t.input());
					break;
				}
				// end switch
			}
		} while (num != 3);

	}

	public int choices() {
		System.out.print("\n=================MENU================\n");
		System.out.print("\n 1- Add employee.");
		System.out.print("\n 2- Manager List.");
		System.out.print("\n 3- Technical Salary Average.");
		System.out.print("\n 4- Search ID.");
		System.out.print("\n 5- Search Name.");
		System.out.print("\n 6- Search Gender.");
		System.out.print("\n 7- Search Date.");
		System.out.print("\n 8- Remove ID.");
		System.out.print("\n 9- Remove Date.");
		System.out.print("\n 10- Last Salary Max.");
		System.out.println("\n 11- Update Employee.");
		System.out.print("Choice:");
		choose = sc.nextInt();
		return choose;
	}

	public ArrayList<Employee> managerList() {
		ArrayList<Employee> m = new ArrayList<>();
		for (Employee v : list) {
			if (v instanceof Manager) {
				m.add(v);
			}
		}
		return m;
	}

	public double technicalSalaryAverage() {
		double salaryAverage = 0;
		for (Employee v : list) {
			if (v instanceof Technician)
				salaryAverage += v.salary();
		}
		return salaryAverage;

	}

	public Employee searchID(String ID) {

		Employee e = null;
		System.out.print("search ID:");
		ID = sc.next();
		for (Employee v : list) {
			if (ID.equals(v.getEmployeeID())) {
				e = v;
				break;
			}

		}
		return e;
	}

	public ArrayList<Employee> searchName(String Name) {

		ArrayList<Employee> eList = new ArrayList<>();
		System.out.print("search Name:");
		Name = sc.next();
		for (Employee v : list) {
			if (Name.equals(v.getFullName())) {
				eList.add(v);
			}

		}
		return eList;
	}

	public ArrayList<Employee> searchGender() {
		String gender;
		ArrayList<Employee> eList = new ArrayList<>();
		System.out.print("search Gender:");
		gender = sc.next();
		if (gender.equals("true")) {
			for (Employee v : list) {
				if (v.isGender()) {
					eList.add(v);
				}
			}
		} else {
			for (Employee v : list) {
				if (v.isGender() == false) {
					eList.add(v);
				}
			}

		}
		return eList;
	}

	public ArrayList<Employee> searchDate() {
		ArrayList<Employee> eList = new ArrayList<>();
		SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyy");
		String s;
		System.out.print("enter work start date:");
		s = sc.next();
		try {
			day = df.parse(s);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (Employee v : list) {
			if (day.equals(v.getWorkStartDate())) {
				eList.add(v);
				break;
			}
		}
		return eList;
	}

	public void removeID(String ID) {
		System.out.print("search ID:");
		ID = sc.next();
		for (Employee v : list) {
			if (ID.equals(v.getEmployeeID())) {
				list.remove(v);
				System.out.println("REMOVED");
				break;
			}
		}
	}

	public void removeDate(Date day) {
		SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyy");
		String s;
		System.out.print("enter work start date:");
		s = sc.next();
		try {
			day = df.parse(s);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (Employee v : list) {
			if (day.equals(v.getWorkStartDate())) {
				list.remove(v);
				System.out.println("REMOVED");
				break;
			}
		}
	}

	public void updateEmployee() {
		System.out.print("search ID:");
		ID = sc.next();
		int i = 0;
		Manager m = new Manager();
		for (Employee v : list) {
			i++;
			if (ID.equals(v.getEmployeeID())) {
				System.out.print("true");
				list.set(i - 1, m.input());
				break;
			}
		}
	}

	public Employee lastSalaryMax() {
		double Max = 0;
		int pos = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).salary() > Max) {
				pos = i;
				Max = list.get(i).salary();
			}
			// end for
		}
		return getEmployees(pos);
	}

	public static void main(String[] args) {
		EmployeeList store = new EmployeeList();
		int choice = 0;
		do {
			choice = store.choices();
			switch (choice) {
				case 1: {
					// add employee
					store.addEmployee();
					break;
				}
				case 2: {
					// show manager
					ArrayList<Employee> m = new ArrayList<>();
					m = store.managerList();
					for (Employee v : m) {
						System.out.println(v);
					}

					break;
				}
				case 3: {
					// show salary technician
					System.out.println(store.technicalSalaryAverage());

					break;
				}
				case 4: {
					// search employee theo ID
					Employee e = store.searchID(ID);
					if (e != null) {
						System.out.println(e);
					} else
						System.out.println("NOT FOUND");
					break;
				}
				case 5: {
					// search employee theo Name
					ArrayList<Employee> eList = store.searchName(fullName);
					if (eList != null) {
						for (Employee v : eList)
							System.out.println(v);
					} else
						System.out.println("NOT FOUND");
					break;
				}
				case 6: {
					// search employee theo gender
					ArrayList<Employee> eList = store.searchGender();
					if (eList != null) {
						for (Employee v : eList)
							System.out.println(v);
					} else {
						System.out.print("NOT FOUND");
					}
					break;
				}
				case 7: {
					// search employee start work in the date
					ArrayList<Employee> eList = store.searchDate();
					if (eList != null) {
						for (Employee v : eList) {
							System.out.println(v);
						}
					} else
						System.out.print("NOT FOUND");
					break;
				}
				case 8: {
					// remove employee theo ID
					store.removeID(ID);
					break;
				}
				case 9: {
					// remove employee theo date
					store.removeDate(day);
					break;
				}
				case 10: {
					//
					System.out.println("Last salary max is:" + store.lastSalaryMax());
					break;
				}
				case 11: {
					store.updateEmployee();
					break;
				}
				/// end switch
			}
		} while (choice != 12);
	}

}
