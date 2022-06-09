package ru.otus.game;

public class DiceFakeNullValue implements Dice {

    @Override
    public int roll() {
        return (Integer)null;
    }
}
