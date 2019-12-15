import java.util.Scanner;

public class task3_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner( System.in );
        System.out.println( "Введите длину массива: " );
        int len = in.nextInt(); // Читаем с консоли размер массива и записываем в len
        int array[] = new int[len]; // Создаём массив int размером в len
        System.out.println( "Введите элемент массива: " );
        for (int i = 0; i < len; i++) {
            array[i] = in.nextInt(); // Заполняем массив элементами, введёнными с консоли
        }

        int low = 0;
        int high = len-1;
        qSort(array, low, high);

        System.out.print( "Вывод элементов массива:" );
        for (int i = 0; i < len; i++) System.out.print(array[i] + " ");

    }

    //описание функции qSort
    public static void qSort(int[] array, int low, int high)
    {
        int i = low;
        int j = high;
        int x = array[low + (high - low) / 2];
        do
        {
            while(array[i] < x) i++;
            while(array[j] > x) j--;
            if(i <= j)
            {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++; j--;
            }
        }
        while(i <= j);

        //рекурсивные вызовы функции qSort
        if (low <  j) qSort(array, low,  j);
        if (i < high) qSort(array, i, high);
    }
}