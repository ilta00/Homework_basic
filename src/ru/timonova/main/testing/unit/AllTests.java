package ru.timonova.main.testing.unit;

public class AllTests {

    public void run(){
        /*Dice dice = new DiceImpl();
        GameWinnerPrinter winnerPrinter = new GameWinnerConsolePrinter();
        Game game = new Game(dice, winnerPrinter);
        game.playGame(new Player("Вася"), new Player("Игорь"));*/

        System.out.println("\n\n----------------------\n\n");

        new DiceImplTest().testDiceImplIfTheValueInRange();
        System.out.println("\n\n----------------------\n\n");

        new GameTest().testGame();
        System.out.println("\n\n----------------------\n\n");
    }
}