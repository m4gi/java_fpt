package long21;

import java.util.ArrayList;
import java.util.Scanner;

final class HSTGUI {

    private final static ArrayList<HstFunction> functionsList = new ArrayList<>();
    private final static ArrayList<String> choiceList = new ArrayList<>();
    private String welcomeMessage = null;

    void run() {
        int length = choiceList.size();
        int num;
        while (true) {
            System.out.println(welcomeMessage);
            for (int i = 0; i < length; i++) {
                System.out.printf("%d. %s\n", i + 1, choiceList.get(i));
            }
            System.out.printf("%d. Exit\n", length + 1);
            System.out.print("Type your choice: ");
            num = Input.nextInt("", 1, length + 1);
            if (num == length + 1) {
                return;
            }
            activeFunction(functionsList.get(num - 1));
            waitEnter();
        }
    }

    void setWelcomeMessage(String message) {
        welcomeMessage = message;
    }

    void add(String choice, HstFunction func) {
        choiceList.add(choice);
        functionsList.add(func);
    }

    private void waitEnter() {
        System.out.print("PRESS ENTER TO CONTINUE...");
        Input.nextString();
        System.out.println();
    }

    private void activeFunction(HstFunction hstFunction) {
        hstFunction.activeFunction();
    }

    @FunctionalInterface
    interface HstFunction {

        void activeFunction();
    }

}

final class Input {

    private final static Scanner scanner = new Scanner(System.in);

    private static int nextIntBasic(String condition) {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.printf("Please input integer %s: ", condition);
            }
        }
    }

    static int nextInt() {
        return nextIntBasic("");
    }

    static int nextInt(String notify) {
        System.out.print(notify);
        return nextInt();
    }

    static int nextInt(String notify, int start, int end) {
        System.out.print(notify);
        while (true) {
            int result = nextIntBasic(String.format("from %d to %d", start, end));
            if (result >= start && result <= end) {
                return result;
            }
            System.out.printf("Please input integer from %d to %d: ", start, end);
        }
    }

    static private double nextDoubleBasic(String condition) {
        while (true) {
            try {
                return Double.parseDouble(scanner.nextLine());
            } catch (Exception e) {
                System.out.printf("Please input double %s: ", condition);
            }
        }
    }

    static double nextDouble() {
        return nextDoubleBasic("");
    }

    static double nextDouble(String notify) {
        System.out.print(notify);
        return nextDouble();
    }

    static double nextDouble(String notify, double start, double end) {
        System.out.print(notify);
        while (true) {
            double result = nextDoubleBasic(String.format("from %.3f to %.3f", start, end));
            if (result >= start && result <= end) {
                return result;
            }
            System.out.printf("Please input double from %.3f to %.3f: ", start, end);
        }
    }

    static String nextString() {
        return scanner.nextLine();
    }

    static String nextString(String notify) {
        System.out.print(notify);
        return nextString();
    }

    static boolean doYouWantContinue() {
        return doYouWantContinue("Do you want to continue(Y/N): ", "Y", "N");
    }

    static boolean doYouWantContinue(String text, String var1, String var2) {
        System.out.print(text);
        while (true) {
            String rs = nextString();
            if (rs.equalsIgnoreCase(var1)) {
                return true;
            } else if (rs.equalsIgnoreCase(var2)) {
                return false;
            } else {
                System.out.printf("Please type %s/%s: ", var1, var2);
            }
        }
    }
}
