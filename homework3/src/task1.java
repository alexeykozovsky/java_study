import java.util.Scanner;

public class task1 {
    // 1.Сортировка выбором
    public static int[] selection(int array[]) {
        for (int min = 0; min < array.length - 1; min++) {
            int minimum = min;
            for (int j = min + 1; j < array.length; j++) {
                if (array[j] < array[minimum]) {
                    minimum = j;
                }
            }
            // меняем местами элементы
            int temp = array[min];
            array[min] = array[minimum];
            array[minimum] = temp;
        }
        return array;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner( System.in );
        System.out.println( "Введите длину массива: " );
        int len = in.nextInt(); // Читаем с консоли размер массива и записываем в len
        int array[] = new int[len]; // Создаём массив int размером в len
        System.out.println( "Введите элемент массива: " );
        for (int i = 0; i < len; i++) {
            array[i] = in.nextInt(); // Заполняем массив элементами, введёнными с консоли
        }
        // Массив создан

        selection( array );

        System.out.print( "Вывод элементов массива:" );
        for (int j = 0; j < array.length; j++) {
            System.out.print( " " + array[j] );
        }

    }
}

