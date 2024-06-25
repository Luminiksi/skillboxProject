package practice.regex;

public class SplitText {

  public static void main(String[] args) {

  }

  public static String splitTextIntoWords(String text) {
    //TODO реализуйте метод
    String regex = "[^a-zA-Z ]";
    text = text.replaceAll(regex, "").replaceAll("\\s+", " ");
    String[] words = text.split("\\s");
    StringBuilder newText = new StringBuilder();
    for (int i = 0; i < words.length; i++) {
      if (i + 1 == words.length) {
        newText.append(words[i]);
      } else {
        newText.append(words[i]).append("\n");
      }
    }
    return newText.toString();
  }

}