package ass;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class tourList {
	private static ArrayList<Tours> list = new ArrayList<>();

	private static int choice;

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
					Domestic dTour = new Domestic();
					list.add(dTour.input());
					break;
				}
				case 2: {
					International i = new International();
					list.add(i.input());
					break;
				}
				// end switch
			}
		} while (num != 3);

	}

	public ArrayList<Tours> List() {
		ArrayList<Tours> d = new ArrayList<>();
		for (Tours v : list) {
			if (v instanceof Domestic) {
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
			e.printStackTrace();
		}
		for (Tours v : list) {
			if (day.equals(v.getStartDate())) {
				eList.add(v);

			}
		}
		return eList;
	}

	public ArrayList<Tours> searchTransport(String transport) {

		ArrayList<Tours> eList = new ArrayList<>();
		System.out.print("search transport:");
		transport = sc.next();
		for (Tours v : list) {
			if (transport.equals(v.getTransport())) {
				eList.add(v);
			}

		}
		return eList;
	}

	public Tours getTours(int i) {
		return list.get(i);
	}

	public Tours miximumCharge() {
		double Min = list.get(0).tourCharge();
		int pos = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).tourCharge() < Min) {
				pos = i;
				Min = list.get(i).tourCharge();
			}
			// end for
		}
		return getTours(pos);
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

	public void removeDate(Date day) {
		SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyy");
		String s;
		System.out.print("enter work start date:");
		s = sc.next();
		try {
			day = df.parse(s);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		for (Tours v : list) {
			if (day.equals(v.getStartDate())) {
				list.remove(v);
				System.out.println("REMOVE");
			}
		}
	}

	public void updateTours() {
		int num;
		do {
			System.out.println("1.update domesticTour");
			System.out.println("2.update intertionalTour");
			System.out.println("3.Eixt");
			num = sc.nextInt();
			switch (num) {

				case 1: {
					System.out.print("search code:");
					code = sc.next();
					int i = 0;
					Domestic m = new Domestic();
					for (Tours v : list) {
						i++;
						if (code.equals(v.getCode())) {
							list.set(i - 1, m.input());
							break;
						}
					}
					break;
				}
				case 2: {
					System.out.print("search code:");
					code = sc.next();
					int j = 0;
					International i = new International();
					for (Tours v : list) {
						j++;
						if (code.equals(v.getCode())) {
							list.set(j - 1, i.input());
							break;
						}
					}
					break;

				}
				// end switch

			}
		} while (num != 3);

	}

	private static final String TOUR_FILE = "Tour.txt";

    public void Save(ArrayList<Tours> list) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(new File(TOUR_FILE));
            oos = new ObjectOutputStream(fos);
            oos.writeObject(list);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            closeStream(fos);
            closeStream(oos);
        }
    }

    public ArrayList<Tours> readFile() {
        ArrayList<Tours> list = new ArrayList<>();
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream(new File(TOUR_FILE));
            ois = new ObjectInputStream(fis);
            list = (ArrayList<Tours>) ois.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            closeStream(fis);
            closeStream(ois);
        }
        return list;
    }

    private void closeStream(InputStream is) {
        if (is != null) {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void closeStream(OutputStream os) {
        if (os != null) {
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

	public int menu() {
		int choose;
		System.out.println("1. Add the list of students and save to flle");
		System.out.println("2. Load the list of students from to file");
		System.out.println("3. EXIT");
		System.out.print("Your choice:");
		choose = sc.nextInt();
		return choose;
	}

	public int choices() {
		int choose;
		System.out.print("Choice:");
		choose = sc.nextInt();
		return choose;
	}

	public static void main(String[] args) {
		tourList store = new tourList();
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
					System.out.println("miximum charge is:" + store.miximumCharge());
					break;
				}
				case 8: {
					// remove employee theo code
					store.removeCode(code);
				}

				case 9: {
					// remove employee theo date
					store.removeDate(day);
				}
				case 11: {
					// update
					store.updateTours();

				}
				case 14: {
					int choise;
					do {
						choise = store.menu();
						switch (choise) {
							case 1: {
								store.Save(list);
								break;
							}
							case 2: {
								store.readFile();
								break;
							}
							case 3: {
								break;
							}
						}
					} while (choise != 3);
					break;
				}

			}
		} while (choice > 0 && choice < 15);

	}

}
