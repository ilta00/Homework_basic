package ru.timonova.main.testing.unit;

import ru.otus.assertions.Assertions;
import ru.otus.game.*;

import java.util.HashSet;
import java.util.Set;

public class DiceImplTest {
    private Set<Integer> rollValues;

    public DiceImplTest() {
        rollValues = new HashSet<Integer>(6);
        rollValues.add(1);
        rollValues.add(2);
        rollValues.add(3);
        rollValues.add(4);
        rollValues.add(5);
        rollValues.add(6);
    }

    public void testDiceImplIfTheValueInRange() {
        String scenario = "V1. Тест вхождения возвращаемого значения в диапазон";
        try {
            Dice dice = new DiceImpl();
            int rollResult = dice.roll();

            boolean expected = true;
            boolean actual = rollValues.contains(rollResult);

            Assertions.assertEquals(expected, actual);

            System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }
}
