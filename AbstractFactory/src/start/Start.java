package start;

import factory.impl.RussianFactory;
import factory.impl.USAFactory;
import factory.interfaces.TransportFactory;
import transport.interfaces.Aircraft;

public class Start {

    private static TransportFactory factory;

    public static void main(String[] args) {

        if(true){  // какое-то условие
            factory = new RussianFactory();
        } else {
            factory = new USAFactory();
        }

        Aircraft aircraft =  factory.createAircraft();
        aircraft.flight();

    }
}
