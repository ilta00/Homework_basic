package ru.timonova.main.exceptions;

public class BigSheetSizeException extends Exception {

    public BigSheetSizeException(int sheetHeight, int sheetWidth, int noteBookHeight, int noteBookWidth) {
        super("Невозможно добавить лист в блокнот, он слишком большой: " + sheetHeight + "x" + sheetWidth + ", размер блокнота: " + noteBookHeight + "x" + noteBookWidth);
    }
}
