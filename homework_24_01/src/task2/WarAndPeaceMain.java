package task2;

import java.io.File;
import java.io.FileNotFoundException;

public class WarAndPeaceMain {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("c:/Users/User/IdeaProjects/java_study/homework_24_01/src/task2/WarAndPeace.txt");
        WarAndPeace task1 = new WarAndPeace("война", file);
        WarAndPeace task2 = new WarAndPeace("и", file);
        WarAndPeace task3 = new WarAndPeace("мир", file);
        System.out.println("   Поиск при помощи regex:");
        task1.counterReg();
        task2.counterReg();
        task3.counterReg();
        System.out.println("\n   Обычный поиск по строке");
        task1.counterString();
        task2.counterString();
        task3.counterString();
    }
}
