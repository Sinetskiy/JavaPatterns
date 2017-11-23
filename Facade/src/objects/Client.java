package objects;

import facade.CarFacade;
import parts.Door;
import parts.Starter;
import parts.Wheel;

public class Client {

    public static void main(String[] args) {
        // вызов без фасада
        Door door = new Door();
        door.open();

        Starter starter = new Starter();
        starter.run();

        Wheel wheel =  new Wheel();
        wheel.turn();

        // вызов с фасадом
        CarFacade carFacade = new CarFacade();
        carFacade.go();

    }

}
