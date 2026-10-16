package SealedClass;

public class SealedExample {


    sealed interface Vehicle permits Car, Bike {}

    record Car(String name) implements Vehicle {}
    record Bike(String name) implements Vehicle {}



    static String describe(Vehicle v) {
        return switch (v) {
            case Car c  -> "Car: " + c.name();
            case Bike b -> "Bike: " + b.name();

        };
    }

    public static void main(String[] args) {
        System.out.println(describe(new Car("Swift")));
        System.out.println(describe(new Bike("Splendor")));
    }
}