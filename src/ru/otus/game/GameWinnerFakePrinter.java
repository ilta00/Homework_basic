package ru.otus.game;

public class GameWinnerFakePrinter implements GameWinnerPrinter {
    private String print;

    @Override
    public void printWinner(Player winner) {
        this.print = winner.getName();
    }

    public String getPrint() {
        return print;
    }

}
