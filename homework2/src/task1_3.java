public class task1_3 {
    public static void main(String[] args) {
        int x = 123456;
        int p = 1;
        do {
            int c = x % 10;
            p = p * c;
            x = x / 10;
        } while (x/10 != 0);
        System.out.println(p);
    }
}
