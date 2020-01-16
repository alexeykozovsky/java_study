package task3$4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class task3$4 {
    public static void main(String[] args) {
        Scanner arr = new Scanner( System.in );
        int[] array = new int[4];
        int N = 0; //счетчик неверных попыток
        int arrNumber;

        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < array.length;) {
            try {
                arrNumber = Integer.valueOf( arr.nextLine() );
                array[i] = arrNumber;
                N=0; //обнуление счетчика неверных попыток
                i++;
            } catch (NumberFormatException e){
                N+=1;
                if (N >= 3){
                    System.out.println("У Вас третья неверная попытка ввода");
                }
                System.out.println("Введите целое число! Осталось " + (3-N) + " попыток");

            }
        }

        ArrayList<Integer> list = new ArrayList<>(  );
        for (int i = 0; i < array.length; i++) {
            list.add( array[i]);
        }

        Collections.sort( list ); // сортировка коллекции по возрастанию
        System.out.println("Вывод коллекции по возрастанию: ");
        System.out.println(list);


//        for (int j = 0; j < array.length; j++){
//            System.out.print(array[j] + "\t");
    }
}
