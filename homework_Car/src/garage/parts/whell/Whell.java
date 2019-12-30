package garage.parts.whell;

import garage.parts.whell.api.IWhell;
import garage.parts.whell.api.Season;

public class Whell implements IWhell {
    private int radius;
    private Season season;
    private String brand;

    public Whell(int radius,
                 Season season,
                 String brand){
        this.radius = radius;
        this.season = season;
        this.brand = brand;
    }


    @Override
    public int getRadius() {
        return radius;
    }

    @Override
    public Season getSeason() {
        return season;
    }

    @Override
    public String getBrand() {
        return brand;
    }
}
