package task1;

public class task1_2 {
    public static void main(String[] args) {
        int z = 0;
        // 1.2 try - finally

        int i2 = 5;
        try {
            int x2 = i2 / z;
        } finally {
            System.out.println("Выполнюсь...");
        }

    }
}
