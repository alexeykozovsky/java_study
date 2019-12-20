import java.util.Scanner;

public class task2_2_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner( System.in );
        System.out.println("Введите число N: ");
        int N = in.nextInt();

        int n;
        int max = 0; // переменная для максимальной цифры
        while (N > 0) {
            n = N % 10; // отделяем последнюю цифру
            if (n > max) {
                max = n;
            }
            N = N / 10; // уменьшаем число N на последнюю цифру
        }
        System.out.println(max);
    }
}