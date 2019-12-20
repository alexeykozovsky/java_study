import java.util.Random;

public class task2_1 {
    public static void main(String[] args) {
        int orel=0;
        int reshka=0;

        for (int i = 0 ;i < 1000; i++) {
            Random brosok = new Random();
            int a = brosok.nextInt(2 );
            if (a == 0) {
                orel++;
            } else {
                reshka++;
            }
        }
        System.out.println("Орел выпал " + orel + " раз, решка выпала " + reshka + " раз");
    }
}
