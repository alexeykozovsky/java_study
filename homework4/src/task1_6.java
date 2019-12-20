public class task1_6 {
    public static void main(String[] args) {
        int N = 1234567;
        System.out.println(N);

        int N1 = 0;
        while(N > 0){
            N1 = N1*10 + N%10;
            N /= 10;
        }
        System.out.println(N1);


    }
}
