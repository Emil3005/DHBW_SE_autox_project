package autox.Tasks;

import autox.elements.Door;
import autox.configuration.*;

public class StateTask {
    public StateTask(){
        System.out.println("State Operation started");
        Door door = new Door();
        door.setState(new Closed());
        System.out.println(door);

        System.out.println();

        door.switchDoor();
        System.out.println(door);

        System.out.println();

        door.switchDoor();
        System.out.println(door);
        System.out.println("State Operation done");
    }

    public static void main(String... args) {
        System.out.println("State Operation started");
        Door door = new Door();
        door.setState(new Closed());
        System.out.println(door);

        System.out.println();

        door.switchDoor();
        System.out.println(door);

        System.out.println();

        door.switchDoor();
        System.out.println(door);
        System.out.println("State Operation done");
    }

}
