package task2;

import java.util.ArrayList;
import java.util.LinkedList;

public class task2 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 100; i++){
            list.add( (int) (Math.random()*100) );
        }

        System.out.println("Список до удаления");

        for (int i = 0; i < 100; i++){
            System.out.println("index " + i + "--" + list.get( i ));
        }

        for (int i = 0; i < 100; i++){
            list.remove( 10 );
        }

        System.out.println("Список после удаления");

        for (int i = 0; i < 100; i++){
            System.out.println("index " + i + "--" + list.get( i ));
        }

    }
}
