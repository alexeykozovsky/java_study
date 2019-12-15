import java.util.Scanner;

public class task3_2b {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int len = in.nextInt(); // Читаем с консоли размер массива и записываем в len
        int array[] = new int[len]; // Создаём массив int размером в len
        System.out.println("Введите элемент массива: ");
        for (int i = 0; i < len; i++) {
            array[i] = in.nextInt(); // Заполняем массив элементами, введёнными с консоли
        }
        // Массив создан

        int temp;
        int left = 0;
        int right = array.length-1;
        do {
            for (int i = left; i < right; i++) {
                if (array[i] > array[i+1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
            right--;
            for (int i = right; i > left; i--) {
                if (array[i] < array[i-1]) {
                    temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                }
            }
            left++;
        } while (left < right);

        System.out.print ("Вывод элементов массива:");
        for (int j = 0; j < array.length; j++) {
            System.out.print (" " + array[j]);
        }
    }
}
