import java.util.Scanner;

public class task1_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите массу динозавра в килограммах: ");
        int massa = in.nextInt();

        System.out.println("Масса динозавра в граммах составляет: " + massa * 1000 + " гр \n" +
                "Масса динозавра в милиграммах составляет: " + massa * 1000000 + " мм \n" +
                "Масса динозавра в милиграммах составляет: " + massa * 0.001 + " т");
    }
}
