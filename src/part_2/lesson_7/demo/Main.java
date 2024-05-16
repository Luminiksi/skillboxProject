package part_2.lesson_7.demo;

public class Main {
    public static void main(String[] args) {
        boolean passIsValid = true;
        boolean isCarantine = true;

        String message = passIsValid && !isCarantine ? "Проход открыт" : "Проход закрыт";

        /*String message;
        if (passIsValid && !isCarantine) {
            message = "Проход открыт";
        } else {
            message = "Проход закрыт";
        }*/

        boolean isPersonal = true;

        String message1 = passIsValid && !isCarantine ? "Проход открыт" :
                (isPersonal? "Проход открыт" : "Проход закрыт");
        /**
         * с 3мя значениями, лучше оставить if т.к. не рекомендовано писать следующую конструкцию:
         *String message1 = passIsValid && !isCarantine ? "Проход открыт" :
         *                 (isPersonal? "Проход открыт только для персонала" : "Проход закрыт");
         */

        if (passIsValid && !isCarantine) {
            message = "Проход открыт";
        } else if (isPersonal) {
            message = "Проход открыт только для персонала";
        } else {
            message = "Проход закрыт";
        }

    }
}

