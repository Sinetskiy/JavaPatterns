package facade;

// фасад для работы
import parts.Door;
import parts.Starter;
import parts.Wheel;

public class CarFacade {

    private Door door = new Door();
    private Starter starter = new Starter();
    private Wheel wheel = new Wheel();

    public void go() {
        door.open();
        starter.run();
        wheel.turn();
    }

}
