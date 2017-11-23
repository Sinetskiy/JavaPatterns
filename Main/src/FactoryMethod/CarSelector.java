package FactoryMethod;

// фабрика по созданию автомобилей
public class CarSelector {

    // фабричный метод
    public Car getCar(RoadType roadType) throws Exception {

        switch (roadType) {
            case CITY:
                return new Porche();
            case OFF_ROAD:
                return new Jeep();
            case GAZON:
                return new NewJeep();
            default:
                throw new Exception("roadType not found ...");
        }

    }
}
