package record;

/**
 * данная штука работает начиная с 17ой java
 */
record Student(String name, int age){
    public Student {
        if (age < 0) {
            System.out.println("Вы создали студента с отрицательным возрастом!");
        }
    }
    public Student(String name){
        this(name, 18);
    }
    /*Но добавлять новые поля сюда, например так:
    public boolean adult;
     уже нельзя,
     можно это делать только внутри конструктора в строке record:
     record Student(String name, int age, boolean adult) {}


     так же тут можно создавать статические поля и методы:*/

    private static final int adultAge = 18;
    public boolean isAdult() {
        return age >= 18;
    }

    public static Student createAdultStudent(String name) {
        return new Student(name, adultAge);
    }

}
