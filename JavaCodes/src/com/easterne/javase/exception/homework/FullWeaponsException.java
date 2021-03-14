package com.easterne.javase.exception.homework;

/**
 * 武器库满了后，发生异常
 */
public class FullWeaponsException extends Exception{
    public FullWeaponsException() {
    }

    public FullWeaponsException(String message) {
        super(message);
    }
}
