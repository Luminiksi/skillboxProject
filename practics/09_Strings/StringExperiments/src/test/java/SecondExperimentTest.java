import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import prictice.Main;

@DisplayName("Эксперимент со строками(мутим с преобразованиями)")
public class SecondExperimentTest {
    @Test
    @DisplayName("Test 1: Первое число - 544, операция - +, второе число - 89")
    void test1() {
        String exp = "544 + 89 = 633";
        launch("544", "89", "+", exp);
    }

    @Test
    @DisplayName("Test 2: Первое число - 653, операция - +, второе число - 90")
    void test2() {
        String exp = "653 + 90 = 743";
        launch("653", "90", "+", exp);
    }

    @Test
    @DisplayName("Test 3: Первое число - 22, операция - *, второе число - 85")
    void test3() {
        String exp = "22 * 85 = 1870";
        launch("22", "85", "*", exp);
    }

    @Test
    @DisplayName("Test 4: Первое число - 34, операция - /, второе число - 2")
    void test4() {
        String exp = "34 / 2 = 17";
        launch("34", "2", "/", exp);
    }

    @Test
    @DisplayName("Test 5: Первое число - 987, операция - -, второе число - 800")
    void test5() {
        String exp = "987 - 800 = 187";
        launch("987", "800", "-", exp);
    }

    @Test
    @DisplayName("Test 6: Первое число - null, операция - -, второе число - 800")
    void test6() {
        String exp = "0 - 800 = -800";
        launch(null, "800", "-", exp);
    }

    @Test
    @DisplayName("Test 7: Первое число - 987, операция - '', второе число - 800")
    void test7() {
        String exp = "987 + 800 = 1787";
        launch("987", "800", "", exp);
    }

    @Test
    @DisplayName("Test 8: Первое число - werw, операция - -, второе число - 800")
    void test8() {
        String exp = "0 - 800 = -800";
        launch("werw", "800", "-", exp);
    }

    @Test
    @DisplayName("Test 9: Первое число - null, операция - *, второе число - ''")
    void test9() {
        String exp = "987 - 0 = 987";
        launch("987", "", "-", exp);
    }

    @Test
    @DisplayName("Test 10: Первое число - 987, операция - sdfsd, второе число - 800")
    void test10() {
        String exp = "Вы ввели не понятную операцию";
        launch("987", "800", "sdfsd", exp);
    }

    private void launch(String first, String second, String operation, String exp) {
        String act = Main.secondExperiment(first, operation, second);
        Assertions.assertEquals(exp, act);
    }
}
