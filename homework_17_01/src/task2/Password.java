package task2;


public class Password {
    public String ExcPassword (String psw) throws MyExc1, MyExc2 {
        if (psw.length() <= 8) {
            throw new MyExc1( "Колличество символов пароля должно равняться или быть больше 8!" );
        } else {
            System.out.println("Ваш пароль сохранен!");
        }
        return psw;
    }
}
