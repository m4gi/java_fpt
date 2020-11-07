package Controller;

/**
 *
 * @author Le Anh Tuan
 */

public class Validation {

    public static boolean checkString(String s) throws Exception {
        if (s == null || s.isEmpty()) {
            throw new Exception("Some fields is empty");
        }
        return true;
    }

    public static boolean checkPhone(String s) throws Exception {
        if (!s.matches("\\d{10}$")) {
            throw new Exception("This is not a phone number");
        }
        return true;
    }
}
