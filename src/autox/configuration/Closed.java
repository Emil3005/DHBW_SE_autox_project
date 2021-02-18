package autox.configuration;

import autox.elements.Door;
import autox.elements.IDoorState;

public class Closed implements IDoorState {

    @Override
    public void switchDoor(Door door) {
        System.out.println("open Door");
        door.setState(new Open());

    }

    public void print(){
        System.out.println("Class Closed");
    }
    public String toString(){
        return "closed";
    }
}