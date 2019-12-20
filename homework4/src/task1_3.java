import java.util.Scanner;

public class task1_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner( System.in );
        System.out.println("Введите радиус большого круга: ");
        int r1 = in.nextInt();
        System.out.println("Введите радиус маленького круга: ");
        int r2 = in.nextInt();

        double Sr = Math.PI*(r1 - r2);
        System.out.println("Площадь кольца равна: " + Sr);
    }
}
