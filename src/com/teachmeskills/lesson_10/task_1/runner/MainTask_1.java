package com.teachmeskills.lesson_10.task_1.runner;

import com.teachmeskills.lesson_10.task_1.myexceptiontask_1.*;
import com.teachmeskills.lesson_10.task_1.numdoc.NumberDocument;
import java.util.Scanner;

/**
 *  Задание 1. (Основное задание)
 *    Доработать нулевое домашнее задание предыдущего урока.
 *
 *    Теперь надо создать свои классы исключений на каждую ситуацию:
 *    5) Проверить содержит ли номер документа последовательность abc.
 *    6) Проверить начинается ли номер документа с последовательности 555.
 *    7) Проверить заканчивается ли номер документа на последовательность 1a2b.
 *
 *    Если номер документа не удовлетворяет условию - то "бросить" исключение.
 *    В методе класса, в котором будут вызываться эти методы для демонстрации работы, перехватить
 *       исключение конструкцией try-catch и в блоке catch вывести сообщение для пользователя(сообщение на консоль).
 *
 *      (--->   Предыдущее Задание   <---)
 *    Написать программу со следующим функционалом:
 *    На вход передать строку(будем считать, что это номер документа).
 *    Номер документа имеет формат xxxx-yyy-xxxx-yyy-xyxy, где x - это число, а y - это буква.
 *      1) Вывести на экран в одну строку два первых блока по 4 цифры
 *      2) Вывести на экран номер документа, но блоки из трех букв заменить на (каждая буква заменятся на )
 *      3) Вывести на экран только одни буквы из номера документа в формате yyy/yyy/y/y в нижнем регистре
 *      4) Вывести на экран буквы из номера документа в формате "Letters:yyy/yyy/y/y" в верхнем регистре
 *        (реализовать с помощью класса StringBuilder)
 *      5) Проверить содержит ли номер документа последовательность abc и вывети сообщение содержит или
 *        нет(причем, abc и ABC считается одинаковой последовательностью).
 *      6) Проверить начинается ли номер документа с последовательности 555.
 *      7) Проверить заканчивается ли номер документа на последовательность 1a2b.
 *      Все эти методы реализовать в отдельном классе в статических методах, которые на вход(входным параметром) будут
 *        принимать ввводимую на вход программы строку.
 */

public class MainTask_1 {

    public static void main(String[] args) {
        System.out.println("Введите номер документа в формате: xxxx-yyy-xxxx-yyy-xyxy, где x - это число, а y - это буква.");
        Scanner scan = new Scanner(System.in);

        try {
            System.out.println(NumberDocument.str5(scan.nextLine()));
        } catch (NotEnoughSymbolsException e) {
            System.err.println("Exception: "+ e.getMessage() +" In class: "+ e.getClass().getSimpleName());
        } catch (Contain_abcOrNotException e) {
            System.err.println("Exception: "+ e.getMessage() +" In class: "+ e.getClass().getSimpleName());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Exception: "+ e.getMessage() +" In class: "+ e.getClass().getSimpleName());
        }

        try {
            System.out.println(NumberDocument.str6(scan.nextLine()));
        } catch (NotEnoughSymbolsException e) {
            System.err.println("Exception: "+ e.getMessage() +" In class: "+ e.getClass().getSimpleName());
        } catch (Contain_555OrNotException e) {
            System.err.println("Exception: "+ e.getMessage() +" In class: "+ e.getClass().getSimpleName());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Exception: "+ e.getMessage() +" In class: "+ e.getClass().getSimpleName());
        }

        try {
            System.out.println(NumberDocument.str7(scan.nextLine()));
        } catch (NotEnoughSymbolsException e) {
            System.err.println("Exception: "+ e.getMessage() +" In class: "+ e.getClass().getSimpleName());
        } catch (Contain_1a2bOrNotException e) {
            System.err.println("Exception: "+ e.getMessage() +" In class: "+ e.getClass().getSimpleName());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Exception: "+ e.getMessage() +" In class: "+ e.getClass().getSimpleName());
        }

        scan.close();

        /*
        0123-abc-4567-def-8g9h
        */
    }

}
