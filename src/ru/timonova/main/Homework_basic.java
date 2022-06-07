package ru.timonova.main;

import ru.timonova.main.exceptions.CraftFactory;
import ru.timonova.main.testing.unit.AllTests;

public class Homework_basic {

    public static void main(String[] args) {
        /* Обработка ошибок
        CraftFactory.createNoteBook();*/

        AllTests allTests = new AllTests();
        allTests.run();

    }
}
