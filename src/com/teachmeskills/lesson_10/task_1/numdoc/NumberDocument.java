package com.teachmeskills.lesson_10.task_1.numdoc;

import com.teachmeskills.lesson_10.task_1.myexceptiontask_1.*;

public class NumberDocument {

    // 5)Проверить содержит ли номер документа последовательность abc и вывети сообщение содержит или нет
    //   (причем, abc и ABC считается одинаковой последовательностью).
    public static String str5(String enterStr) throws NotEnoughSymbolsException,ArrayIndexOutOfBoundsException,Contain_abcOrNotException {
        String s = "xxxx-yyy-xxxx-yyy-xyxy";
        enterStr = enterStr.toLowerCase();

        if (enterStr.length() < s.length()) {
            // Вы ввели меньше символов, чем нужно!
            throw new NotEnoughSymbolsException("Incorrect data entry.");
        }

        if (enterStr.length() > s.length()) {
            // Вы ввели число символов больше, чем нужно!
            throw new ArrayIndexOutOfBoundsException("Incorrect data entry.");
        }

        if (!enterStr.contains("abc")) {
            // Номер документа вообще не содержит "abc"!
            throw new Contain_abcOrNotException("Number document contain \"abc\".");
        } else {
            enterStr = "Number document contain \"abc\".";
        }

        return enterStr;
    }

    // 5)Проверить начинается ли номер документа с последовательности 555.
    public static String str6(String enterStr) throws NotEnoughSymbolsException,ArrayIndexOutOfBoundsException,Contain_555OrNotException {
        String s = "xxxx-yyy-xxxx-yyy-xyxy";

        if (enterStr.length() < s.length()) {
            // Вы ввели меньше символов, чем нужно!
            throw new NotEnoughSymbolsException("Incorrect data entry.");
        }

        if (enterStr.length() > s.length()) {
            // Вы ввели число символов больше, чем нужно!
            throw new ArrayIndexOutOfBoundsException("Incorrect data entry.");
        }

        if (!enterStr.startsWith("555")) {
            // Номер документа не начинается с "555" !
            throw new Contain_555OrNotException("Number document dont starts with \"555\".");
        } else {
            enterStr = "Number document starts with \"555\".";
        }

        return enterStr;
    }

    // 7)Проверить заканчивается ли номер документа на последовательность 1a2b.
    public static String str7(String enterStr) throws NotEnoughSymbolsException,ArrayIndexOutOfBoundsException,Contain_1a2bOrNotException {
        String s = "xxxx-yyy-xxxx-yyy-xyxy";

        if (enterStr.length() < s.length()) {
            // Вы ввели меньше символов, чем нужно!
            throw new NotEnoughSymbolsException("Incorrect data entry.");
        }

        if (enterStr.length() > s.length()) {
            // Вы ввели число символов больше, чем нужно!
            throw new ArrayIndexOutOfBoundsException("Incorrect data entry.");
        }

        if (!enterStr.endsWith("1a2b")) {
            // Номер документа не заканчивается на "1a2b"!
            throw new Contain_1a2bOrNotException("Number document dont end with \"1a2b\".");
        } else {
            enterStr = "Number document ends with \"1a2b\".";
        }

        return enterStr;
    }

}
