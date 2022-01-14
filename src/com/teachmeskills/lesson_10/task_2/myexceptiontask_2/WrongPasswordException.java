package com.teachmeskills.lesson_10.task_2.myexceptiontask_2;

public class WrongPasswordException extends Exception {

    public WrongPasswordException() { }

    public WrongPasswordException(String message) {
        super(message);
    }

}
