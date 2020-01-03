package Calc5;

import java.util.List;
import java.util.Scanner;

import static Calc5.Calc5.calc;


public class CalcMain5 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Веведите выражение: ");
        String s = in.nextLine();
        Calc5 n = new Calc5();
        List<String> expression = n.parse(s);
        boolean flag = n.flag;
        if (flag) {
            for (String x : expression);
            System.out.println("Ответ = " + calc(expression));
        }
    }

}
