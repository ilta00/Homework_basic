package ru.timonova.main.exceptions;

public class CraftFactory {

    public static void createNoteBook() {
        try (NoteBook noteBook = new NoteBook(10, 50, 20);) {
            System.out.println(noteBook);
            Sheet firstSheet = new Sheet(50, 20);
            System.out.println(firstSheet);

            try {
                noteBook.addSheet(firstSheet);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            System.out.println(noteBook);

            System.out.println("");
            System.out.println("Обработка исключения - значение по умолчанию");
            Sheet secondSheet = new Sheet(200, 200);
            System.out.println(secondSheet);

            System.out.println("");
            System.out.println("Обработка исключения - вывод сообщения");
            try {
                noteBook.addSheet(secondSheet);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            System.out.println(noteBook);

            System.out.println("");
            System.out.println("Обработка исключения - rethrow");
            try {
                Sheet lastSheet = getLastSheetOfNoteBook(noteBook);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        } finally {
            System.out.println("Конец!");
        }
    }

    private static Sheet getLastSheetOfNoteBook(NoteBook noteBook) throws Exception {
        return noteBook.getSheetByIndex(100);
    }


}


