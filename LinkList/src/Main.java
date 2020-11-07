
/**
 *
 * @author 
 */
public class Main {

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
//        Customer a = new Customer("", "DE140280");
//        Customer b = new Customer("Tuan", "123");
//        Customer c = new Customer("Le", "31");
//        Customer d = new Customer("Anh", "0");
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
        list.writeFile();

    }
}
