package Tour;

import java.util.ArrayList;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class tourList {
	private ArrayList<Tours> list = new ArrayList<>();
	private static int choose;
	private static String code, title, transport;
	private static Date day;
	Scanner sc = new Scanner(System.in);

	public void addTours() {
		int num;
		do {
			System.out.println("1.add domesticTour");
			System.out.println("2.add intertionalTour");
			System.out.println("3.Eixt");
			num = sc.nextInt();
			switch (num) {
				case 1: {
					domesticTours dTour = new domesticTours();
					list.add(dTour.input());
					break;
				}
				case 2: {
					domesticTours iTours = new domesticTours();
					list.add(iTours.input());
					break;
				}

			}
		} while (num != 3);

	}

	public ArrayList<Tours> List() {
		ArrayList<Tours> d = new ArrayList<>();
		for (Tours v : list) {
			if (v instanceof domesticTours) {
				d.add(v);
			}
		}
		return d;
	}

	public Tours searchCode(String code) {

		Tours tour = null;
		System.out.print("search code:");
		code = sc.next();
		for (Tours v : list) {
			if (code.equals(v.getCode())) {
				tour = v;
				break;
			}

		}
		return tour;
	}

	public ArrayList<Tours> searchTitle(String title) {

		ArrayList<Tours> eList = new ArrayList<>();
		System.out.print("search tile:");
		title = sc.next();
		for (Tours v : list) {
			if (title.equals(v.getTitle())) {
				eList.add(v);
			}

		}
		return eList;
	}

	public ArrayList<Tours> searchStartDate() {
		ArrayList<Tours> eList = new ArrayList<>();
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
		for (Tours v : list) {
			if (day.equals(v.getStartDate())) {
				eList.add(v);
				break;
			}
		}
		return eList;
	}

	public ArrayList<Tours> searchTransport(String transport) {

		ArrayList<Tours> eList = new ArrayList<>();
		System.out.print("search transport:");
		transport = sc.next();
		for (Tours v : list) {
			if (title.equals(v.getTransport())) {
				eList.add(v);
			}

		}
		return eList;
	}

	public void removeCode(String code) {
		System.out.print("search ID:");
		code = sc.next();
		for (Tours v : list) {
			if (code.equals(v.getCode())) {
				list.remove(v);
				System.out.println("REMOVED");
				break;
			}
		}
	}

	public int choices() {
		System.out.println("1- Add Tours");
		System.out.println("2- List Tours");
		System.out.println("3- Search Tours by code");
		System.out.println("4- Search Tours by title");
		System.out.println("5- Search Tours by date start");
		System.out.println("6- Search Tours Transport");
		System.out.println("7- Remove Tours");
		System.out.print("Choice:");
		choose = sc.nextInt();
		return choose;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tourList store = new tourList();
		int choice = 0;
		do {
			choice = store.choices();
			switch (choice) {
				case 1: {
					store.addTours();
					break;
				}
				case 2: {
					// show manager
					ArrayList<Tours> d = new ArrayList<>();
					d = store.List();
					for (Tours v : d) {
						System.out.println(v);
					}

					break;
				}
				case 3: {
					// search employee theo code
					Tours e = store.searchCode(code);
					if (e != null) {
						System.out.println(e);
					} else
						System.out.println("NOT FOUND");
					break;
				}
				case 4: {
					// search employee theo title
					ArrayList<Tours> eList = store.searchTitle(title);
					if (eList != null) {
						for (Tours v : eList)
							System.out.println(v);
					} else
						System.out.println("NOT FOUND");
					break;
				}
				case 5: {
					// search employee start the date
					ArrayList<Tours> eList = store.searchStartDate();
					if (eList != null) {
						for (Tours v : eList) {
							System.out.println(v);
						}
					} else
						System.out.print("NOT FOUND");
					break;
				}
				case 6: {
					// search employee theo transport
					ArrayList<Tours> eList = store.searchTransport(transport);
					if (eList != null) {
						for (Tours v : eList)
							System.out.println(v);
					} else
						System.out.println("NOT FOUND");
				}
				case 7: {
					// remove employee theo code
					store.removeCode(code);
				}
				case 8: {

				}
			}
		} while (choice > 0 && choice < 15);

	}

}
