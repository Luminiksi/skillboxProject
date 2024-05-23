import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import prictice.StringExperiments;


@DisplayName("Эксперимент со строками")
public class StringExperimentsTest {
    @Test
    @DisplayName("Test 1: Первая строка - картофель, вторая строка - кукуруза")
    void test1() {
        String exp = "картофель != кукуруза";
        launch("картофель", "кукуруза", exp);
    }
    @Test
    @DisplayName("Test 2: Первая строка - лошадь, вторая строка - лошадь")
    void test2() {
        String exp = "лошадь == лошадь";
        launch("лошадь", "лошадь", exp);
    }
    @Test
    @DisplayName("Test 3: Первая строка - строитель, вторая строка - апельсин")
    void test3() {
        String exp = "строитель != апельсин";
        launch("строитель", "апельсин", exp);
    }
    @Test
    @DisplayName("Test 4: Первая строка - мороженое, вторая строка - Мороженое")
    void test4() {
        String exp = "мороженое != Мороженое";
        launch("мороженое", "Мороженое", exp);
    }
    @Test
    @DisplayName("Test 5: Первая строка - 001, вторая строка - 01")
    void test5() {
        String exp = "001 != 01";
        launch("001", "01", exp);
    }
    @Test
    @DisplayName("Test 6: Первая строка - 000, вторая строка - 000")
    void test6() {
        String exp = "000 == 000";
        launch("000", "000", exp);
    }
    @Test
    @DisplayName("Test 7: Первая строка - лошадь, вторая строка - молоко")
    void test7() {
        String exp = "лошадь != молоко";
        launch("лошадь", "молоко", exp);
    }
    @Test
    @DisplayName("Test 8: Первая строка - молоко, вторая строка - молоко")
    void test8() {
        String exp = "молоко == молоко";
        launch("молоко", "молоко", exp);
    }
    @Test
    @DisplayName("Test 7: Первая строка - лошадь, вторая строка - Лошадь")
    void test9() {
        String exp = "лошадь != Лошадь";
        launch("лошадь", "Лошадь", exp);
    }

    private void launch(String first, String second, String exp) {
        String act = StringExperiments.theExperiment(first, second);
        Assertions.assertEquals(exp, act);
    }

}
