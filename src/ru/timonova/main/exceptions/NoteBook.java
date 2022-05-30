package ru.timonova.main.exceptions;

import java.util.ArrayList;

public class NoteBook implements AutoCloseable {
    private int height;
    private int width;
    private ArrayList<Sheet> sheets;
    private int sheetCount = 0;

    public NoteBook(int countLSheet, int height, int width) {
        sheets = new ArrayList<>(countLSheet);
        this.height = height;
        this.width = width;
    }

    public void addSheet(Sheet sheet) throws Exception {
        if (sheet.getHeight() > this.height || sheet.getWidth() > this.width)
            throw new Exception("Невозможно добавить лист в блокнот, он слишком большой: " + sheet.getHeight() + "x" + sheet.getWidth() + ", размер блокнота: " + height + "x" + width);
        sheetCount++;
        sheets.add(sheet);
    }

    public Sheet getSheetByIndex(int index) throws Exception {
        return this.sheets.get(index);
    }

    @Override
    public void close() {
        sheets = null;
        this.height = 0;
        this.width = 0;
    }

    @Override
    public String toString() {
        return "NoteBook{height='" + this.height + "', width='" + this.width + "', sheetCount='" + this.sheetCount + "', sheets='" + this.sheets + "'}";
    }
}
