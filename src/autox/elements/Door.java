package autox.elements;

import autox.configuration.Closed;

public class Door {
    private IDoorState state;

    public void setState(IDoorState state){
        this.state = state;
    }
    public void switchDoor(){
        state.switchDoor(this);
    }
    public String toString(){
        return "state = " + state;
    }
}
