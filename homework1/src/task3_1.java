import java.util.Scanner;

public class task3_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Как тебя зовут? ");
        String name = in.next();
        in.close();

        if (name.equals("Вася")){
            System.out.println("Привет! \nЯ тебя так долго ждал");
        } else if (name.equals("Анастасия")){
            System.out.println("Я тебя так долго ждал");
        } else {
            System.out.println("Добрый день, а вы кто?");
        }
    }
}
