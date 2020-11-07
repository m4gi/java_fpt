package listdemo;

import java.util.ArrayList;

public class MyList {

    ArrayList<Integer> array = new ArrayList<>();
    int n;

    public MyList(int n) {
        this.n = n;
    }

    public void Input() {
        int val;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Element: ");
            val = ListDemo.sc.nextInt();
            array.add(val);
        }
    }

    public void Display() {
        for (Integer val : array) {
            System.out.print(val + "\t");
        }
    }
}
