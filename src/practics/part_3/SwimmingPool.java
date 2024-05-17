package practics.part_3;

/**
 * Задание 3
 */
public class SwimmingPool {
    public static void main(String[] args) {
        int volume = 1200;

        int fillingSpeed = 30; //30 litres per minute
        int devastationSpeed = 10; //10 litres per minute

        int currentValume = 0;
        int minutes = 0;

        while (currentValume != volume) {
            currentValume += fillingSpeed - devastationSpeed;
            minutes++;
        }

        System.out.println("Через " + minutes + " минут бассейн наполнится");
    }
}
