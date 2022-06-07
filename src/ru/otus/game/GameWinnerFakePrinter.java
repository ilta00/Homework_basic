package ru.otus.game;

public class GameWinnerFakePrinter implements GameWinnerPrinter{
    private String print;

    @Override
    public void printWinner(Player winner) {
        setPrint("Победитель: " + winner.getName());
    }

    public String getPrint() {
        return print;
    }

    public void setPrint(String print) {
        this.print = print;
    }
}
