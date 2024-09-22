package lessons_13;

import java.util.regex.Pattern;

class User {
    public static void main(String[] args) {
        if(signInTask1("Alex","Alex12", "Alex12")) {
            System.out.println("well");
        } else {
            System.out.println("bad");
        }
        taskStar();
    }
    //
    static boolean signInTask1 (String login, String password, String confirmPassword) {
        try {
            boolean check = false;
            loginCheckException(login);
            passwordCheckException(password, confirmPassword);
            return true;
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e);
            return false;
        }
    }
    // проверка логина на соответствие
    static void loginCheckException(String login) throws WrongLoginException {
        if (login.isEmpty()) {
            throw new WrongLoginException("Login Empty");
        } if (!(login.length() < 20)) {
            throw new WrongLoginException("Login longer than 20 characters");
        } if (login.contains(" ")) {
            throw new WrongLoginException("Login contains a space");
        }
    }
    // проверка пароля на соответствие
    static void passwordCheckException(String password, String confirmPassword) throws WrongPasswordException{
        if (password.isEmpty()) {
            throw new WrongPasswordException("Password Empty");
        } if (!(password.length() < 20)) {
            throw new WrongPasswordException("Password longer than 20 characters");
        } if (password.contains(" ")) {
            throw new WrongPasswordException("Password contains a space");
        } if (!Pattern.compile(".*\\d.*").matcher(password).find()) {
            throw new WrongPasswordException("Password does not contains number");
        } if (!confirmPassword.equals(password)) {
            throw new WrongPasswordException("confirmPassword does not equals password");
        }
    }

    // задание со звездочкой в моем понимание философское,
    // в моем понимание смысл блока finally в том что он гарантированно выполнится.
    static void taskStar() {
        try {
            //вариант первый бесконечный цикл
            // int number = 0;
            // while(true) {
            //     System.out.println(number += 100);
            // }
            // ---------------------------------------------
            // вариант 2 выключить JVM
            // System.exit(0);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("блок finally");
        }
    }
}
