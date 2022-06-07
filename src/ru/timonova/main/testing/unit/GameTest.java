package ru.timonova.main.testing.unit;

import ru.otus.assertions.Assertions;
import ru.otus.game.*;

public class GameTest {

    public void testGame() {
        String scenario = "V1. Тест расчета факториала положительного числа";
        try {

            Dice dice = new DiceFakeIncreasingValues();
            GameWinnerPrinter winnerPrinter = new GameWinnerFakePrinter();

            Game game = new Game(dice, winnerPrinter);
            game.playGame(new Player("Вася"), new Player("Игорь"));
            String actual = winnerPrinter.getPrint();
            String expected = "Победитель: Игорь";

            Assertions.assertEquals(expected, actual);

           /* expected = 720;
            actual = factorialCalculator.factorial(6);
            Assertions.assertEquals(expected, actual);*/

            System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }
}
