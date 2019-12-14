import java.util.Scanner;

public class task2_2 {
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

        // do ... while
        System.out.print ("Вывод элементов массива:");
        int i1 = 0;
        do {
            System.out.print(" " + array[i1]);
            i1+=2;
        } while (i1 < len);
        System.out.println("\n Следующий способ");

        // while
        System.out.print ("Вывод элементов массива:");
        int i2 = 0;
        while (i2 < len) {
            System.out.print(" " + array[i2]);
            i2+=2;
        }
        System.out.println("\n Следующий способ");

        // for
        System.out.print ("Вывод элементов массива:");
        for (int i3 = 0; i3 < len; i3+=2) {
            System.out.print (" " + array[i3]);
        }
        System.out.println("\n Следующий способ");

        // foreach
        System.out.print ("Вывод элементов массива:");
        for (int i4: array) {
            if (i4%2 == 1) {
                System.out.print (" " + array[i4-1]);
            }
        }
        System.out.println("\n Конец");

    }
}
