import java.util.Arrays;
import java.util.Scanner;

public class task3_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner( System.in );
        System.out.println( "Введите длину массива: " );
        int len = in.nextInt(); // Читаем с консоли размер массива и записываем в len
        int array1[] = new int[len]; // Создаём массив int размером в len
        System.out.println( "Введите элемент массива: " );
        for (int i = 0; i < len; i++) {
            array1[i] = in.nextInt(); // Заполняем массив элементами, введёнными с консоли
        }
        int[] result = mergesort(array1);
        System.out.println(Arrays.toString(result));
    }

    public static int[] mergesort(int[] array1) {
        int[] buffer1 = Arrays.copyOf(array1, array1.length);
        int[] buffer2 = new int[array1.length];
        int[] result = mergesortInner(buffer1, buffer2, 0, array1.length);
        return result;
    }


    public static int[] mergesortInner(int[] buffer1, int[] buffer2,
                                       int startIndex, int endIndex) {
        if (startIndex >= endIndex - 1) {
            return buffer1;
        }

        // уже отсортирован.
        int middle = startIndex + (endIndex - startIndex) / 2;
        int[] sorted1 = mergesortInner(buffer1, buffer2, startIndex, middle);
        int[] sorted2 = mergesortInner(buffer1, buffer2, middle, endIndex);

        // Слияние
        int index1 = startIndex;
        int index2 = middle;
        int destIndex = startIndex;
        int[] result = sorted1 == buffer1 ? buffer2 : buffer1;
        while (index1 < middle && index2 < endIndex) {
            result[destIndex++] = sorted1[index1] < sorted2[index2]
                    ? sorted1[index1++] : sorted2[index2++];
        }
        while (index1 < middle) {
            result[destIndex++] = sorted1[index1++];
        }
        while (index2 < endIndex) {
            result[destIndex++] = sorted2[index2++];
        }
        return result;
    }
}