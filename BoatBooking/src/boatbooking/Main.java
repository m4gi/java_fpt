package boatbooking;

/**
 *
 * @author Le Tuan
 */
public class Main {

    public static void main(String[] args) throws Exception {
        MyListBoat list = new MyListBoat();
        Boat a = new Boat("B03", "Sug", 12, 3, "PA", 11);
        Boat b = new Boat("B01", "Mil", 10, 5, "PC", 5.7);
        Boat c = new Boat("B02", "App", 5, 2, "PB", 4);
        Boat d = new Boat("B04", "Boo", 9, 5, "PD", 5);
        Boat e = new Boat("B05", "Roo", 7, 6, "PE", 15);
        Boat f = new Boat("B07", "Bee", 11, 3, "PF", 12);
        list.addHead(a);
        list.addToTail(f);
        list.addHead(e);
        list.addHead(b);
        list.addHead(c);
        list.addToTail(d);
        list.display();
        System.out.println("------");
        System.out.println("Size" + list.getSize());
        System.out.println("------");
        list.deleteFirst();
        list.display();
//        String fname = "src\\hello.txt";
//        
//        list.saveToFile(fname);
        String fname = "src\\ListBoat.txt";
        Manager menu = new Manager();

        while (true) {
            switch (menu.Menu()) {
                case 1:
                    switch (menu.MenuListBoat()) {
                        case 1:
                            list.loadFromFile(fname);
                            break;
                        case 2:
                            b = list.enterData();
                            list.addHead(b);
                            break;
                        case 3:
                            list.display();
                            break;
                        case 4:
                            list.saveToFile(fname);
                            break;
                        case 5:
                            list.SearchBoat();
                            break;
                        case 6:

                    }
            }

        }
    }
}
