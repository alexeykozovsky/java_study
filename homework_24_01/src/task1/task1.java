package task1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task1 {
    public static void main(String[] args) {
        String str = "Я люблю JAVA";

        System.out.println("Метод string.matches()");
        System.out.println(str.matches("h*"));//false, с регулярным выражением сравнивается вся строка
        System.out.println(str.matches("h+"));//false, с регулярным выражением сравнивается вся строка
        System.out.println(str.matches("h?"));//false, с регулярным выражением сравнивается вся строка

        System.out.println("________________________________________");

        System.out.println("Метод Matcher и find");
        Pattern pt1 = Pattern.compile("h*");
        Matcher matcher1 = pt1.matcher(str);
        Pattern pt2 = Pattern.compile("h+");
        Matcher matcher2 = pt2.matcher(str);
        Pattern pt3 = Pattern.compile("h?");
        Matcher matcher3 = pt3.matcher(str);

        System.out.println(matcher1.find());//true Квантификатор "Совпадение ноль или несколько раз: *"
        System.out.println(matcher2.find());//false Квантификатор "Совпадение один или несколько раз: +"
        System.out.println(matcher3.find());//true Квантификатор "Совпадение ноль или один раз: ?"



    }
}
