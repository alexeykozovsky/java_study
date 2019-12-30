package calc;

import java.util.Scanner;

public class CalcMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        System.out.println("Введите два числа");
        int first = scanner.nextInt();
        int second = scanner.nextInt();

        Calc c = new Calc();
        c.add( first, second );
        c.sub( first, second );
        c.mult( first, second );
        c.div( first, second );

    }
}
