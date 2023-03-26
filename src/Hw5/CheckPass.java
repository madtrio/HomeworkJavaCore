package Hw5;

import java.util.Objects;

public class CheckPass {
    private CheckPass() {
    }

    public static boolean validate(String login, String password, String confirmPass) {
        try {
            check(login, password, confirmPass);
            return true;
        } catch (WrongLoginException e) {
            System.out.println((e.getMessage()));
            return false;
        } catch (WrongPasswordException e) {
            System.out.println((e.getMessage()));
            return false;
        }
    }

    public static void check(String login, String password, String confirmPass) throws WrongLoginException, WrongPasswordException {
        if (Objects.isNull(login) || login.length() > 20) {
            throw new WrongLoginException("Длинна логина должна быть меньше 20");
        }
        if (Objects.isNull(password) || password.length() >= 20) {
            throw new WrongPasswordException("Длинна пароля должна быть меньше или равна 20 ");
        }
        if (!password.equals(confirmPass)) {
            throw new WrongPasswordException("Пароль не совпадает с подтверждением");
        }
    }
}
