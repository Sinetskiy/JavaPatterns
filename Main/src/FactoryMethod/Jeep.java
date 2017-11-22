package FactoryMethod;

public class Jeep implements  Car {

    @Override
    public void drive() {
        System.out.println("Drive speed 50 km/h");
    }

    @Override
    public void stop() {
        System.out.println("Stoped at 5 sec");
    }
}
