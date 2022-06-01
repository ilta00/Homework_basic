package ru.timonova.main.exceptions;

public class HeightLargerThanAllowedRunTimeException extends RuntimeException {

    public HeightLargerThanAllowedRunTimeException() {
        super("Высота листа больше допустимой!");
    }
}
