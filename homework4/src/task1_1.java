import java.util.Scanner;

public class task1_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner( System.in );
        System.out.println("Введите число а: ");
        int a = in.nextInt();
        System.out.println("Введите число b: ");
        int b = in.nextInt();
        System.out.println("Введите число с: ");
        int c = in.nextInt();

        if (a == b && b == c) {
            System.out.println("Все числа одинаковы");
        } else if (a == b && b != c) {
            System.out.println("Одинаковы только числа a и b");
        } else if (b == c && b != a) {
            System.out.println("Одинаковы только числа b и c");
        } else  if (a == c && c != b) {
            System.out.println("Одинаковы только числа a и с");
        } else {
            System.out.println("Все числа различны");
        }
    }
}
