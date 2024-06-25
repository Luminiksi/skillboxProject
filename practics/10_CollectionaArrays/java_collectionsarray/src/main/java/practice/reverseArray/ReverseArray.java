package practice.reverseArray;

public class ReverseArray {

    public static String[] reverse(String[] strings) {
        //TODO: Напишите код, который меняет порядок расположения элементов внутри массива на обратный.
        int centerLength = strings.length / 2;
        for (int i = 0; i < centerLength; i++) {
            String buffer = strings[i];
            int index = strings.length - i - 1;
            strings[i] = strings[index];
            strings[index] = buffer;
        }
        return strings;
    }

}