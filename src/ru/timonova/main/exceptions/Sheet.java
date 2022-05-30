package ru.timonova.main.exceptions;


public class Sheet {
    private final static int MAX_HEIGHT = 100;
    private final static int MAX_WIDTH = 70;
    private int height;
    private int width;

    public Sheet(int height, int width) {
        System.out.println("Добавление листа " + height + "x" + width);
        try {
            setHeigth(height);
        } catch (Exception e) {
            this.height = MAX_HEIGHT;
        }
        try {
            setWidth(width);
        } catch (Exception e) {
            this.width = MAX_WIDTH;
        }
    }

    private void setHeigth(int height) throws Exception {
        if (height > MAX_HEIGHT)
            throw new Exception("Высота листа больше допустимой!");
        this.height = height;
    }

    private void setWidth(int width) throws Exception {
        if (width > MAX_WIDTH)
            throw new Exception("Ширина листа больше допустимой!");
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public String toString() {
        return "Sheet{height='" + this.height + "', width='" + this.width + "'}";
    }
}