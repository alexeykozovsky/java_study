package task2;

import java.util.Scanner;

public class ExceptionMain {
    public static void main(String[] args) {
        Scanner in = new Scanner( System.in );
        System.out.println("Введите новый пароль");
        String psw = in.nextLine();

        Password password = new Password();

        try {
            password.ExcPassword( psw );
        } catch (MyExc1 myExc1) {
            myExc1.printStackTrace();
        }


    }
}
