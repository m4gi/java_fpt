package short11;

import java.util.Scanner;

public class Short11 {

    public static int CharToInt(char c) {
        int n = 0;
        switch (c) {
            case '0':
                n = 0;
                break;
            case '1':
                n = 1;
                break;
            case '2':
                n = 2;
                break;
            case '3':
                n = 3;
                break;
            case '4':
                n = 4;
                break;
            case '5':
                n = 5;
                break;
            case '6':
                n = 6;
                break;
            case '7':
                n = 7;
                break;
            case '8':
                n = 8;
                break;
            case '9':
                n = 9;
                break;
            case 'a':
                n = 10;
                break;
            case 'b':
                n = 11;
                break;
            case 'c':
                n = 12;
                break;
            case 'd':
                n = 13;
                break;
            case 'e':
                n = 14;
                break;
            case 'f':
                n = 15;
                break;

        }
        return n;
    }

    public static int CharToInt2(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        return c - 'a' + 10;
    }

    public static int IntToChar(char c) {
        if (c >= 0 && c <= 9) {
            return (char) (c + '0');
        }
        return (char) (c + 'a' + 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "";
        System.out.println("Nhập cơ số: ");
        int a = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập số cần đổi: ");
        s = sc.nextLine();
        int n = 0;
        for (int i = 0; i < s.length(); i++) {
            n += CharToInt(s.charAt(i)) * Math.pow(a, s.length() - 1 - i);
        }
        System.out.println("So o he so 10: " + n);
    }

}
