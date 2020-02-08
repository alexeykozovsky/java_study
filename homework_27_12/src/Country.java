import api.ICountry;

public enum Country implements ICountry, Comparable<Country> {
    BELARUS( 207_595, 9_475_174 ),
    RUSSIA( 17_125_191, 146_780_720 ),
    POLAND( 312_679, 38_313_035 ),
    LIETUVA( 65_301, 2_790_472 ),
    CHINA( 9_598_962, 1_404_328_611 ),
    JAPAN( 377_944, 126_225_000 ),
    GERMANY( 357_385, 83_019_200 ),
    FRANCE( 674_685, 65_060_692 ),
    GREAT_BRITAIN( 243_809, 66_273_576 ),
    USA( 9_519_431, 328_915_700 );

    private int area;
    private int population;

    Country (int area, int population) {
        this.area = area;
        this.population = population;
    }
    @Override
    public int getArea() {
        return area;
    }

    @Override
    public int getPopulation() {
        return population;
    }

    public int compare(Country country){
        if (this.area == country.area){
            return 0;
        } else if (this.area > country.area) {
            return 1;
        } else {
            return -1;
        }
    }

    public static Country a(String str){
        String str1 = str.toUpperCase();
        Country country = Country.valueOf( str1 );
        return country;
    }

}


