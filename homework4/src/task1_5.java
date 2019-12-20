import java.util.Scanner;

public class task1_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner( System.in );
        System.out.println("Введите шестизначное число N: ");
        int N = in.nextInt();


        int sum = 0;
        int pr = 1;
        int n;
        while (N > 0) {
            n = N % 10;
            N = N / 10;
            sum += n;
            pr *= n;
        }
        System.out.println(N);
        System.out.println("Среднее арифметическое цифр числа N = " + sum/6.0);
        System.out.println("Среднее геометрическое цифр числа N = " + Math.pow(pr, 1.0/6.0));
    }
}
