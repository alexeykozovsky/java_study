package garage.parts.engine;

import garage.parts.engine.api.FuelType;
import garage.parts.engine.api.IChangebleFuelType;

public class MercedesEngine implements IChangebleFuelType {
    private final String id;
    private final int capacity;
    private FuelType fuelType;
    private boolean running = false;

    public MercedesEngine(int capacity,
                          FuelType fuelType,
                          String id){

        this.capacity = capacity;
        this.fuelType = fuelType;
        this.id = id;

    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public int getCapacity() {
        return capacity;
    }

    @Override
    public FuelType getFuelType() {
        return fuelType;
    }

    @Override
    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public boolean start(){
        if(!running){
            running = true;
        } else {
//            throw new IllegalArgumentException("Немогу завесту уже заведенный мотор");
        }
        return running;
    }
    public boolean stop(){
        if(running){
            running = false;
        } else {
//            throw new IllegalArgumentException("Немогу остановить уже остановленный мотор");
        }
        return running;
    }
    public double running(){
        if(running){
            //TODO добавить рандом
            return 2;
        }
        return 0;
    }
}
