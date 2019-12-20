import java.util.Scanner;

public class task1_2_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner( System.in );
        System.out.println("Введите возраст дракона: ");
        int N = in.nextInt();

        int gol, glaz;
        if (N > 300) {
            gol = 200 * 3 + 100 * 2 + (N-300) + 3;
        } else if (N > 200 && N <= 300) {
            gol = 200 * 3 + (N - 200) * 2 + 3;
        } else {
            gol = N * 3 + 3;
        }
        glaz = gol * 2;
        System.out.println("У вашего дракона " + gol + " голов и " + glaz + " глаз");
    }
}
