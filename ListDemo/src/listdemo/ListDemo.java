/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listdemo;

import java.util.Scanner;

/**
 *
 * @author MAGI
 */
public class ListDemo {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter size: ");
        int size = sc.nextInt();
        MyArray MArr = new MyArray(size);
        MArr.input();
        MArr.Display();
        System.out.println("\n====================");
        System.out.println("Enter size: ");
        int sizeA = sc.nextInt();
        MyList MList = new MyList(sizeA);
        MList.Input();
        MList.Display();
        System.out.println("\n====================");
        System.out.println("Enter size: ");
        int sizeL = sc.nextInt();
        MyLink mlk = new MyLink(sizeL);
        mlk.AddElement();
        mlk.AddFirst();
        mlk.AddLast();
        mlk.Display();
    }

}
