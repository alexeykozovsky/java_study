package task1;

import java.util.Date;
import java.util.LinkedList;

public class PassportMainLinked {
    public static void main(String[] args) {
        LinkedList<Passport> passportList = new LinkedList<>(  );
        Passport passport1 = new Passport();
        passport1.setId( "9P123456789" );
        passport1.setEffectiveAt(new Date() );
        passport1.setFio( "Иванов Иван Иванович" );

        long startAdd = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            passportList.add( passport1 );
        }
        long finishAdd = System.currentTimeMillis();
        long timeAdd = finishAdd - startAdd;

        long startRemove = System.currentTimeMillis();
        for (int j = 0; j < 1_000_000; j++){
            passportList.remove( passport1 );
        }
        long finishRemove = System.currentTimeMillis();
        long timeRemove = finishRemove - startRemove;

        System.out.println("Время на выполнение программы (добавление)= " + timeAdd + " миллисекунд");
        System.out.println("Время на выполнение программы (удаление)= " + timeRemove + " миллисекунд");
        System.out.println(passportList);


    }
}
