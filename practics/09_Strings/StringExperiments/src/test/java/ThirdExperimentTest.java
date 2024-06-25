import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import prictice.Main;

@DisplayName("Эксперимент со строками(Эксперименты с подстроками)")
public class ThirdExperimentTest {
    @Test
    @DisplayName("Test 1: Беллинсгаузен Васисуалий Никифорович")
    void test1() {
        String exp = "Фамилия: Беллинсгаузен\n" +
                "Имя: Васисуалий\n" +
                "Отчество: Никифорович";
        launch("Беллинсгаузен Васисуалий Никифорович", exp);
    }

    @Test
    @DisplayName("Test 2: Андреев Дмитрий Иванович")
    void test2() {
        String exp = "Фамилия: Андреев\n" +
                "Имя: Дмитрий\n" +
                "Отчество: Иванович";
        launch("Андреев Дмитрий Иванович", exp);
    }

    @Test
    @DisplayName("Test 3: Кольцов Леонид Ильич")
    void test3() {
        String exp = "Фамилия: Кольцов\n" +
                "Имя: Леонид\n" +
                "Отчество: Ильич";
        launch("Кольцов Леонид Ильич", exp);
    }

    @Test
    @DisplayName("Test 4: Кольцов ")
    void test4() {
        String exp = Main.WRONG_STRING;
        launch("Кольцов ", exp);
    }

    @Test
    @DisplayName("Test 5: Кольцов Леонид")
    void test5() {
        String exp = Main.WRONG_STRING;
        launch("Кольцов Леонид", exp);
    }

    @Test
    @DisplayName("Test 6: Кольцов Л")
    void test6() {
        String exp = Main.WRONG_STRING;
        launch("Кольцов Л", exp);
    }

    @Test
    @DisplayName("Test 7: Кольцов")
    void test7() {
        String exp = Main.WRONG_STRING;
        launch("Кольцов", exp);
    }

    private void launch(String string, String exp) {
        String act = Main.thirdExperiment(string);
        Assertions.assertEquals(exp, act);
    }

}
