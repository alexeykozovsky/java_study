import java.util.Scanner;

public class task4 {
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
        System.out.print ("Вывод элементов массива:");
        System.out.print (" " + array[0]); // выводим первый элемент отсортированного массива
        for (int j = 1; j < array.length; j++) { // начиная со второго элемента сравниваем его с предыдущим
            if (array[j-1] != array[j] ) {
                System.out.print (" " + array[j]); // если не равны выводим текущий элемент
            }

        }
    }
}
