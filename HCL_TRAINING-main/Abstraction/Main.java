package Abstraction;

public class Main {
    public static void main(String[] args) {
        payments p1 = new Cards();
        p1.pay();

        payments p2 = new upi();
        p2.pay();
    }
}