package com.teachmeskills.lesson_10.task_2.runner;

import com.teachmeskills.lesson_10.task_2.createanaccount.CreateAnAccount;
import com.teachmeskills.lesson_10.task_2.myexceptiontask_2.*;

import java.util.Scanner;

/**
 *  Задание 2. (Основное задание)
 *    Создать класс, в котором будет статический метод.
 *    (почитать и понять, чем статический метод отличается от нестатического - обсудить на занятии по необходимости)
 *    Этот метод принимает на вход три параметра:
 *     - login
 *     - password
 *     - confirmPassword
 *    Все поля имеют тип данных String.
 *    Длина login должна быть меньше 20 символов и не должен содержать пробелов.
 *    Если login не соответствует этим требованиям, необходимо выбросить WrongLoginException.
 *    Длина password должна быть меньше 20 символов, не должен содержать пробелов и должен содержать хотя бы одну цифру.
 *    Также password и confirmPassword должны быть равны.
 *    Если password не соответствует этим требованиям, необходимо выбросить WrongPasswordException.
 *    WrongPasswordException и WrongLoginException - пользовательские классы исключения с двумя конструкторами – один
 *       по умолчанию, второй принимает сообщение исключения и передает его в конструктор класса Exception.
 *    Метод возвращает true, если значения верны или false в другом случае.
 */

public class MainTask_2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Для создания аккаунта придумайте логин и пароль.\nСначала напишете желаемый логин.\n"+
                "Затем напишете желаемый пароль.\nПосле подтвердите пароль.");

        try {
            System.out.println(CreateAnAccount.checkLoginAndPassword(scan.nextLine(),scan.nextLine(),scan.nextLine()));
        } catch (WrongLoginException e) {
            System.err.println("Exception: "+ e.getMessage() +" In class: "+ e.getClass().getSimpleName());
            System.out.println("false");
        } catch (WrongPasswordException e) {
            System.err.println("Exception: "+ e.getMessage() +" In class: "+ e.getClass().getSimpleName());
            System.out.println("false");
        }

        scan.close();

        /*
        abcdefghij0123456789
        */
    }

}
