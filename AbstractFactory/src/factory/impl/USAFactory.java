package factory.impl;

import factory.interfaces.TransportFactory;
import transport.impl.aircraft.Boing747;
import transport.impl.car.Porche;
import transport.interfaces.Aircraft;
import transport.interfaces.Car;

public class USAFactory implements TransportFactory {
    @Override
    public Car createCar() {
        return new Porche();
    }

    @Override
    public Aircraft createAircraft() {
        return new Boing747();
    }
}
