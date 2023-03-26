package Hw5;


public class Main {
    public static void main(String[] args) {
        boolean result = CheckPass.validate("test_111", "qwertY_1234", "qwerty_12345");
        if (result) {
            System.out.println("Логин и пароль корректные");
        } else {
            System.out.println("Логин и/или пароль некорректные");
        }
    }
}