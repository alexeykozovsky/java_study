public class task1_2 {
    public static void main(String[] args) {
        int x = 10;
        long fac = 1;
        for (int i = 1; i < x+1; i++) {
            fac *= i;
        }
        System.out.println("Факториал числа " + x + " = " + fac);

    }
}
