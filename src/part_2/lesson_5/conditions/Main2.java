package part_2.lesson_5.conditions;

public class Main2 {
    public static void main(String[] args) {
//        запас бумаги (количество листов)
        int paperReserve = 600000;
//        запас чернил (тоже измеряется количеством листов с учётом печати с двух сторон)
        int inkReserve = 600000;
//        количество листов для обложек
        int coverReserve = 2000;

//        печатающий вал должен быть разогрет до температуры в определённом диапазоне:
        double printRollerMinTemp = 80.5;
        double printRollerMaxTemp = 120.75;

//        количество страниц в одной книге
        int pagesInBook = 530;
//        количество книг
        int booksCount = 2000;

//        режим холодной печати
        boolean coldPrintingMode = true;
//        текущая температура печатающего вала
        double printRollerTemp = 200;

//        необходимое количество бумаги на все книги
        int papersCount  = booksCount * pagesInBook / 2;
//        количество листов на которые будут потрачены чернила (т.е + обложки -
//        печать одной обложки тратится столько же чернил, сколько на один лист бумаги
        int inkedPapersCount = papersCount + booksCount;

        boolean paperIsEnough = papersCount <= paperReserve;
        boolean inkIhsEnough = inkedPapersCount <= inkReserve;
        boolean coversAreEnough = booksCount <= coverReserve;
        boolean rollerTempIsNormal = printRollerTemp > printRollerMinTemp && printRollerTemp < printRollerMaxTemp;

        if (paperIsEnough && inkIhsEnough && coversAreEnough &&
                (coldPrintingMode || rollerTempIsNormal)) {
            System.out.println("Печать разрешена");
        } else {
            System.out.println("Печать запрещена");
        }

    }
}
