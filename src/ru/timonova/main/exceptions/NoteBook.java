package ru.timonova.main.exceptions;

import java.util.ArrayList;
import java.util.List;

public class NoteBook implements AutoCloseable {
    private int height;
    private int width;
    private List<Sheet> sheets;
    private int sheetCount = 0;

    public NoteBook(int countLSheet, int height, int width) {
        sheets = new ArrayList<Sheet>(countLSheet);
        this.height = height;
        this.width = width;
    }

    public void addSheet(Sheet sheet) throws Exception {
        if (sheet.getHeight() > this.height || sheet.getWidth() > this.width)
            throw new BigSheetSizeException(sheet.getHeight(), sheet.getWidth(), height, width);
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
