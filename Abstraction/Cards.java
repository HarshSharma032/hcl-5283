package Abstraction;

public class Cards extends payments {
    @Override
    void pay() {
        System.out.println("Payment through Card");
    }
}