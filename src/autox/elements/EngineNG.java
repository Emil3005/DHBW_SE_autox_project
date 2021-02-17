package autox.elements;

public class EngineNG implements IElectricEngine {

    @Override
    public void EngineOn() {

    }

    @Override
    public void EngineOff() {

    }

    @Override
    public void IncreaseRPM(double deltaRPM, double seconds) {

    }

    @Override
    public void DecreaseRPM(double deltaRPM, double seconds) {

    }

    @Override
    public void move() {
        battery.usage(3);

    }
}
