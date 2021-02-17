package autox.elements;

import autox.elements.battery.Battery;

public interface IElectricEngine {
    Battery battery = new Battery();
    public void EngineOn();
    public void EngineOff();
    public void IncreaseRPM(double deltaRPM, double seconds);
    public void DecreaseRPM(double deltaRPM, double seconds);
    public void move();

}
