package ru.otus.game;

public class DiceFakeIncreasingValues implements Dice {
    private static int count = 0;

    @Override
    public int roll() {
        count++;
        return count;
    }
}
