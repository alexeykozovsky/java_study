import java.util.Scanner;

public class task2_2_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner( System.in );
        System.out.println("Введите число N: ");
        int N = in.nextInt();



        int d = 0; // переменная для количества делителей
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                d+=1;
            }
        }
        if(d == 2) { // если количество делителей равно 2 (1 и само число), то число простое
            System.out.println("Число N простое");
        }else {
            System.out.println("Число N непростое");
        }
    }
}
