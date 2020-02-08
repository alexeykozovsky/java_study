public class CountryMain {
    public static void main(String[] args) {
        System.out.println(Country.BELARUS == Country.BELARUS); //true
        System.out.println(Country.BELARUS ==  Country.valueOf( "BELARUS" )); //true
        System.out.println(Country.BELARUS ==  Country.a( "Belarus" )); //true

        Country country = Country.valueOf("BELARUS");
        Country country2 = Country.BELARUS;
        System.out.println(country == country2); //true

        Country country3 = Country.valueOf("ZIMBABWE"); //ошибка при при компиляции, нет такого энума

        Country country4 = Country.RUSSIA;
        System.out.println(country2.compare(country4)); // метод для сравнения площадей стран compareTo

    }
}
