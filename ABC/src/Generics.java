

public class Generics {
    public static void main(String[] args) {
        int n=10, m=20;
        System.out.println(add(n, m));
    }
    public static <T> T add(T num1, T num2){
        return num1 + num2;
    }
}
