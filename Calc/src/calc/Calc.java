package calc;

public class Calc {
    void add(int a, int b){
        int add = a + b;
        System.out.println("Сумма = " + add);
    }
    void sub(int a, int b){
        int sub = a - b;
        System.out.println("Вычитание = " + sub);
    }
    void mult(int a, int b){
        int mult = a * b;
        System.out.println("Умножение = " + mult);
    }
    void div(float a, float b){
        float div = a / b;
        System.out.println("Деление = " + div);
    }

}
