package FactoryMethod;

// фабрика по созданию автомобилей
public class CarSelector {

    // фабричный метод
    public Car getCar(RoadType roadType) {

        Car car = null;
        switch (roadType) {
            case CITY:
                car = new Porche();
                break;
            case OFF_ROAD:
                car = new Jeep();
                break;
            case GAZON:
                car = new NewJeep();
                break;
        }

        return car;

    }
}
