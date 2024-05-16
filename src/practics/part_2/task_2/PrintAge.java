package practics.part_2.task_2;

public class PrintAge {
    public static void main(String[] args) {
        int vasyaAge = 29;
        int katyaAge = 14;
        int mishaAge = 36;

        int min = -1;
        int middle = -1;
        int max = -1;

        if (vasyaAge <= katyaAge && vasyaAge <= mishaAge) {
            min = vasyaAge;
            if (katyaAge >= mishaAge) {
                max = katyaAge;
                middle = mishaAge;
            } else {
                max = mishaAge;
                middle = katyaAge;
            }
        } else if (katyaAge <= vasyaAge && katyaAge <= mishaAge) {
            min = katyaAge;
            if (vasyaAge >= mishaAge) {
                max = vasyaAge;
                middle = mishaAge;
            } else {
                max = mishaAge;
                middle = vasyaAge;
            }
        } else {
            min = mishaAge;
            if (vasyaAge >= katyaAge) {
                max = vasyaAge;
                middle = katyaAge;
            } else {
                max = katyaAge;
                middle = vasyaAge;
            }
        }

        System.out.println("Minimal age: " + min);
        System.out.println("Middle age: " + middle);
        System.out.println("Maximal age: " + max);
    }
}
