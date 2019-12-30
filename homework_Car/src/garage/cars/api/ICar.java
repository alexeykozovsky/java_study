package garage.cars.api;

import garage.parts.key.IKey;

public interface ICar {
    String getModel();
    String getBrand();

    void drive();
//    boolean open(IKey key);
    void close();
    void start();
    void stop();
    void fuel();
    void changeWheel();
    void driverSeat();
    void passengerSeat();

}
