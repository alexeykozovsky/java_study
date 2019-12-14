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

        for(int a = 1; a < len; a++) {
            for (int b = len - 1; b >= a; b--) {
                if (array[b - 1] > array[b]) {
                    // меняем местами элементы
                    int temp = array[b-1];
                    array[b-1] = array[b];
                    array[b] = temp;
                }
            }
        }
        System.out.print ("Вывод элементов массива:");
        for (int j = 0; j < array.length; j++) {
            System.out.print (" " + array[j]);
        }
    }
}
