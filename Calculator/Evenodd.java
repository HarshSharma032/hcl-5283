package Calculator;

import java.util.function.Predicate;

class EvenOdd {
    public static void main(String[] args) {

        Predicate<Integer> isEven = n -> n % 2 == 0;

        Predicate<Integer> isOdd = n -> n % 2 != 0;

        System.out.println("Is 4 even? " + isEven.test(4));
        System.out.println("Is 7 even? " + isEven.test(7));
        System.out.println("Is 5 odd? " + isOdd.test(5));
    }
}