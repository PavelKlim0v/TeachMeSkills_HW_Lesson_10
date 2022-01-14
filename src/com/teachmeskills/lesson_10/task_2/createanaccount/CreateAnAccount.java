package com.teachmeskills.lesson_10.task_2.createanaccount;

import com.teachmeskills.lesson_10.task_2.myexceptiontask_2.*;

public class CreateAnAccount {

    public static boolean checkLoginAndPassword(String login,String password,String confirmPassword) throws WrongLoginException, WrongPasswordException{
        String s = "xxxxYyyyXxxxYyyyXxxx";

        // Вы ввели больше символов, чем нужно и не должен содержать "пробелов"
        if (login.length() > s.length() || login.contains(" ")) {
            throw new WrongLoginException("Длина login должна быть меньше 20 символов и не должен содержать пробелов.");
        }

        // Вы ввели больше символов, чем нужно и не должен содержать "пробелов", а также Не содержит цифр
        if (password.length() > s.length() || password.contains(" ") ||
                !password.contains("0") || !password.contains("1") || !password.contains("2") ||
                !password.contains("3") || !password.contains("4") || !password.contains("5") ||
                !password.contains("6") || !password.contains("7") || !password.contains("8") ||
                !password.contains("9")) {
            throw new WrongPasswordException("Длина password должна быть меньше 20 символов, "+
                    "не должен содержать пробелов и должен содержать хотя бы одну цифру.");
        }

        // Пароль должен совпадать с подтвержденным паролем
        if (!confirmPassword.equals(password)) {
            throw new WrongLoginException("Введенные пароли должны совпадать.");
        }

        return true;
    }

}
