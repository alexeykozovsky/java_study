package task1;

public class task1_3 {
    public static void main(String[] args) {
        int z = 0;

        // 1.3 try - catch - finally
        int i3 = 3;
        try {
            int x = i3 / z;
        } catch (ArithmeticException e) {
            System.out.println("Деление на 0!");
        } finally {
            System.out.println("Выполняюсь...");
        }
    }
}
