import java.util.Scanner;

public class task2_2_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner( System.in );
        System.out.println("Введите число N: ");
        int N = in.nextInt();

        int kol = 0;
        System.out.println("Простые делители заданного числа N: ");
        for (int j = 1; j <= N; j++) {
            int d = 0; // переменная для количества делителей
            for (int i = 1; i <= j; i++) {
                if (j % i == 0) {
                    d+=1;
                }
            }
            if(d == 2) {
                if (N % j == 0) {
                    System.out.println(j);
                }
            }
        }
    }
}
