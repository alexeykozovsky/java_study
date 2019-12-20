import java.util.Scanner;

public class task1_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner( System.in );
        System.out.println("Введите четырехзначное число N: ");
        int N = in.nextInt();

        int n1 = N / 1000;
        int n2 = (N - n1 * 1000)/100;
        int n3 = (N - n1 * 1000 - n2 * 100)/10;
        int n4 = N % 10;
        if (n1 < n2 && n2 < n3 && n3 < n4) {
            System.out.println( "Последовательность возрастающая" );
        } else if (n1 > n2 && n2 > n3 && n3 > n4) {
            System.out.println( "Последовательность убывающая" );
        } else {
            System.out.println("Последовательность отсутствует");
        }

    }
}
