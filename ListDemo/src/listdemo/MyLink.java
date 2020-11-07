package listdemo;

import java.util.LinkedList;

public class MyLink {

    LinkedList<Integer> mll = new LinkedList<>();
    int n;
    int val;

    public MyLink(int size) {
        this.n = size;
    }

    public void AddElement() {
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Element: ");
            val = ListDemo.sc.nextInt();
            mll.add(val);
        }

    }

    public void AddFirst() {
        System.out.print("Enter First Element: ");
        val = ListDemo.sc.nextInt();
        mll.addFirst(val);
    }

    public void AddLast() {
        System.out.print("Enter Last Element: ");
        val = ListDemo.sc.nextInt();
        mll.addLast(val);
    }

    public void Display() {
        for (Integer val : mll) {
            System.out.print(val + "\t");
        }
    }
}
