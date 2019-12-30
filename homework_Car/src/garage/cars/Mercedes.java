package garage.cars;

import garage.cars.api.ACars;
import garage.parts.engine.api.IEngine;
import garage.parts.lock.ILock;
import garage.parts.whell.api.IWhell;

public class Mercedes extends ACars {
    private String model;
    private IEngine engine;
    private IWhell whell;
    private int seatsNumber;
    private String catDL;
    private ILock lock;


    public Mercedes(String model,
                    IEngine engine,
                    IWhell whell,
                    int seatsNumber,
                    String catDL,
                    ILock lock){
        this.model = model;
        this.engine = engine;
        this.whell = whell;
        this.seatsNumber = seatsNumber;
        this.catDL = catDL;
        this.lock = lock;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public String getBrand() {
        return "Mercedes";
    }

    public IEngine getEngine() {
        return engine;
    }

    public IWhell getWhell() {
        return whell;
    }

    public void setSeatsNumber(int seatsNumber) {
        this.seatsNumber = seatsNumber;
    }

    public int getSeatsNumber() {
        return seatsNumber;
    }

    public String getCatDL() {
        return catDL;
    }

    public void setCatDL(String catDL) {
        this.catDL = catDL;
    }

    public ILock getLock() {
        return lock;
    }


}
