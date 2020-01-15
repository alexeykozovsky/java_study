package task1;

public class task1_1 {
    public static void main(String[] args) {
        int z = 0;

        //  1.1 try - catch
        int i1 = 10;
        try {
            int x = i1 / z;
        } catch ( Exception e ) {
            System.out.println("Деление на 0!");
        }

    }

}
