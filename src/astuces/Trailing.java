package astuces;

public class Trailing {
    public static void main(String[] args) {
        int count = 0;
        int n = 20;
        while (n > 4) {
            n /= 5;
            System.out.println(n);
            count += n;
            System.out.println("count " + count);
        }
        System.out.println(count);

    }

}
