package factory.interfaces;

import transport.interfaces.Aircraft;
import transport.interfaces.Car;

//фабрика по созданию транспортных средств
public interface TransportFactory {

    // что фабрика будет производить

    Car createCar(); // автомобили

    Aircraft createAircraft(); // самолеты

}
