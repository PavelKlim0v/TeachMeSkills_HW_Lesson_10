package com.teachmeskills.lesson_10.task_2.myexceptiontask_2;

public class WrongLoginException extends Exception {

    public WrongLoginException() { }

    public WrongLoginException(String message) {
        super(message);
    }

}
