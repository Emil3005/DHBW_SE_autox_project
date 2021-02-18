package autox.configuration;

import autox.elements.Door;
import autox.elements.IDoorState;

public class Open implements IDoorState {

    @Override
    public void switchDoor(Door door) {
        System.out.println("close Door");
        door.setState(new Closed());

    }

    public void print(){
        System.out.println("Class Open");
    }
    public String toString(){
        return "open";
    }
}
