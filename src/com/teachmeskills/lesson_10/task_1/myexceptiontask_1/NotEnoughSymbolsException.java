package com.teachmeskills.lesson_10.task_1.myexceptiontask_1;

public class NotEnoughSymbolsException extends Exception {

    public NotEnoughSymbolsException() { }

    public NotEnoughSymbolsException(String message) {
        super(message);
    }

}
