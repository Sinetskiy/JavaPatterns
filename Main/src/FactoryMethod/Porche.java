package FactoryMethod;

public class Porche implements Car{

    @Override
    public void drive() {
        System.out.println("Drive speed 150 km/h");
    }

    @Override
    public void stop() {
        System.out.println("Stoped at 1 sec");
    }
}
