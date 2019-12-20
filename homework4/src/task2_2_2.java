import java.util.Scanner;

public class task2_2_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner( System.in );
        System.out.println("Введите число N: ");
        int N = in.nextInt();


        int N1 = 0;
        int N_old = N;
        while (N > 0) {
            N1 = N1 * 10 + N % 10;
            N = N / 10;
        }
        System.out.println(N1);
        if (N1 == N_old) {
            System.out.println("Палиндром");
        } else {
            System.out.println("Не палиндром");
        }
    }
}
