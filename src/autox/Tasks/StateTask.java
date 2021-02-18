package autox.Tasks;

import autox.elements.Door;
import autox.configuration.*;

public class StateTask {

    public static void main(String... args) {
        Door door = new Door();
        door.setState(new Closed());
        System.out.println(door);

        System.out.println();

        door.switchDoor();
        System.out.println(door);

        System.out.println();

        door.switchDoor();
        System.out.println(door);

    }

}
