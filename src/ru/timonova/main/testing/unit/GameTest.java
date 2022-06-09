package ru.timonova.main.testing.unit;

import ru.otus.assertions.Assertions;
import ru.otus.game.*;

public class GameTest {

    public void testGamePrintWinner() {
        String scenario = "G1. Тест вывода победителя";
        try {

            Dice dice = new DiceFakeIncreasingValues();
            GameWinnerFakePrinter winnerPrinter = new GameWinnerFakePrinter();

            Game game = new Game(dice, winnerPrinter);
            game.playGame(new Player("Вася"), new Player("Игорь"));
            String actual = winnerPrinter.getPrint();
            String expected = "Игорь";

            Assertions.assertEquals(expected, actual);

            System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }

    public void testGameEqualsValue() {
        String scenario = "G2. Тест одинакового значения";
        try {

            Dice dice = new DiceFakeConstValue();
            GameWinnerFakePrinter winnerPrinter = new GameWinnerFakePrinter();

            Game game = new Game(dice, winnerPrinter);
            game.playGame(new Player("Вася"), new Player("Игорь"));
            String actual = winnerPrinter.getPrint();
            String expected = "Ничья";

            Assertions.assertEquals(expected, actual);

            System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }

    public void testGameNullValue() {
        String scenario = "G3. Тест нулевых значений";
        try {
            Dice dice = new DiceFakeNullValue();
            GameWinnerFakePrinter winnerPrinter = new GameWinnerFakePrinter();

            Game game = new Game(dice, winnerPrinter);
            game.playGame(new Player("Вася"), new Player("Игорь"));
            String actual = winnerPrinter.getPrint();
            String expected = "Ошибка";

            Assertions.assertEquals(expected, actual);

            System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }
}
