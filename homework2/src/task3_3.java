import java.util.Scanner;

public class task3_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner( System.in );
        System.out.println( "Введите длину массива: " );
        int len = in.nextInt(); // Читаем с консоли размер массива и записываем в len
        int array[] = new int[len]; // Создаём массив int размером в len
        System.out.println( "Введите элемент массива: " );
        for (int i = 0; i < len; i++) {
            array[i] = in.nextInt(); // Заполняем массив элементами, введёнными с консоли
        }

        int k;
        for (int a = 1; a < array.length; a++) {
            k = array[a];
            int b = a - 1;
            while (b >= 0 && array[b] > k) {
                array[b + 1] = array[b];
                b = b - 1;
            }
            array[b + 1] = k;
        }

        System.out.print( "Вывод элементов массива:" );
        for (int j = 0; j < array.length; j++) {
            System.out.print( " " + array[j] );
        }
    }
}