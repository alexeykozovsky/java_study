import java.util.Scanner;

public class task2_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner( System.in );
        System.out.println("Введите число N: ");
        int N = in.nextInt();

        int sum = 0;
        for (int i = 1; i < N; i++) {
            if (N % i == 0) {
                sum += i;
            }
        }
        if (sum == N) {
            System.out.println("Число N совершенно");
        } else {
            System.out.println("Число N несовершенно");
        }
    }
}
