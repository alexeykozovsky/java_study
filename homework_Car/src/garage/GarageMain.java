package garage;

import garage.cars.Mercedes;
import garage.parts.engine.MercedesEngine;
import garage.parts.engine.api.FuelType;
import garage.parts.lock.Lock;
import garage.parts.whell.Whell;
import garage.parts.whell.api.Season;

public class GarageMain {
    public static void main(String[] args) {
        Mercedes mercedes = new Mercedes("GL166",
                new MercedesEngine(6, FuelType.DIESEL, "tdi"),
                new Whell( 18, Season.WINTER,"Michelin" ),
                5,
                "B",
                new Lock( "123456" ) );

        System.out.println("Поздравляем с покупкой нового " + mercedes.getBrand() + mercedes.getModel() + "!");
        System.out.println("Прокатимся?");

        System.out.println("Сперва, давайте откроем машину");
        mercedes.start();
        mercedes.

        // Увы, мы так никуда и не поехали(((





    }
}
