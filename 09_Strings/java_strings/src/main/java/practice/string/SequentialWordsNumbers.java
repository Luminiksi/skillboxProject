package practice.string;

public class SequentialWordsNumbers {
    public static void main(String[] args) {
        String text = "Это просто текст, для примера работы программы";
        System.out.println(sequentialWordsNumbers(text));
    }

    public static String sequentialWordsNumbers(String text){
        StringBuilder newText = new StringBuilder();
        if (text.isBlank()){
            return "";
        }
        int index = 1;
        newText.append("(" + index + ") ");
        for (int i = 0; i < text.length(); i++) {
            if (checkChar(text, i)) {
                newText.append("(" + ++index + ") ");
                newText.append(text.charAt(i));
            } else {
                newText.append(text.charAt(i));
            }
        }
        return newText.toString();
    }

    public static boolean checkChar(String text, int index) {
//        Если перед симолом идет пробел - то true если нет - false
        if (index == 0 || text.charAt(index) == ' ') {
            return false;
        }
        if (text.charAt(index - 1) == ' ') {
            return true;
        }
        return false;
    }
}
