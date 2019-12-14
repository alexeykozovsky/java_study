public class task2 {
    public static void main(String[] args) {

        int x1 = 5 + 2 / 8;  // x1 = 5 + 0 = 0
        System.out.println("x1=" + x1);

        int x2 = (5 + 2) / 8; // x2 = 7/8 = 0
        System.out.println("x2=" + x2);

        int two3 = 2;
        int x3 = (5 + two3 ++) / 8; // (5 + 2) / 8 = 7 / 8 = 0
        System.out.println("x3=" + x3);

        int two4 = 2;
        int eight4 = 8;
        int x4 = (5 + two4 ++) / -- eight4; // (5 + 2) / 7 = 7 / 7 = 1

        System.out.println("x4=" + x4);

        int two5 = 2;
        int eight5 = 8;
        int x5 = (5 * 2 >> two5 ++) / -- eight5; // (10 >> 2 ) / 7 = 2 / 7 = 0
        System.out.println("x5=" + x5);

        int two6 = 2;
        int eight6 = 8;
        int x6 = (5 + 7 > 20 ? 68 : 22 * 2 >> two6 ++) / -- eight6; // (12 > 20, 22*2 >> 2 ) / 7 = (44 >> 2) / 7 = 11 / 7 = 1
        System.out.println( "x6=" + x6 );

        /* НЕ КОМПИЛИРУЕТСЯ!!!
        int two7 = 2;
        int eight7 = 8;
        int x7 = (5 + 7 > 20 ? 68 => 68 : 22 * 2 >> two7 ++) / -- eight7;
        System.out.println( "x7=" + x7 );
         */

        boolean x8 = 6-2 > 3 && 12*12 <= 119; // 4 > 3 И 144 <= 119, true И false, результат false
        System.out.println( "x8=" + x8 );

        boolean x9 = true && false; // true И false, результат false
        System.out.println( "x9=" + x9 );
    }
}
