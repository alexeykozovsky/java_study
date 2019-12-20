import java.util.Scanner;

public class task2_2_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner( System.in );
        System.out.println("Введите число а: ");
        int a = in.nextInt();
        System.out.println("Введте число b: ");
        int b = in.nextInt();

        // Наименьший общий делитель
        if (a > b) {
            for (int i = 2; i < a; i++){
                if(a % i == 0 && b % i == 0) {
                    System.out.println("Наименьший общий делитель чисел " + a + " и " + b + " равен " + i);
                    break;
                }
            }
        } else {
            for (int i = 2; i < b; i++){
                if(a % i==0 && b % i==0) {
                    System.out.println("Наименьший общий делитель чисел" + a + " и " + b + " равен " + i);
                    break;
                }
            }
        }

        // Найменьшее общее кратное
        for (int j = Math.max( a, b ); j < Integer.MAX_VALUE; j++) {
            if (j % a == 0 && j % b == 0) {
                System.out.println("Наименьшее общее кратное чисел" + a + " и " + b + " равен " + j);
                break;
            }
        }
    }
}
