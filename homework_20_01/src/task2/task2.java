package task2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class task2 {
    public static void main(String[] args) {
        Queue<Integer> list = new LinkedList<>();
        for (int i = 0; i < 10; i++){
            list.add( (int) (Math.random()*10) );
        }

        System.out.println("Список до удаления");

        for (int i = 0; i < 10; i++){
            System.out.println("index " + i + "--" + ((LinkedList<Integer>) list).get( i ));
        }

        for (int i = 0; i < list.size(); i++){
            if (((LinkedList<Integer>) list).get(i) < 3) {
                list.poll();
            }
        }

        System.out.println("Список после удаления");

        for (int i = 0; i < 10; i++){
            System.out.println("index " + i + "--" + ((LinkedList<Integer>) list).get( i ));
        }




    }
}
