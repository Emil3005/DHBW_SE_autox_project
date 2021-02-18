package autox.elements;

public class EngineX implements IElectricEngine {

    @Override
    public void EngineOn() {
        System.out.println("EngineX on");
    }

    @Override
    public void EngineOff() {
        System.out.println("EngineX off");
    }

    @Override
    public void IncreaseRPM(double deltaRPM, double seconds) {
        System.out.println("EngineX increase RPM by "+ deltaRPM + " in " + seconds + " seconds");
    }

    @Override
    public void DecreaseRPM(double deltaRPM, double seconds) {
        System.out.println("EngineX decrease RPM by "+ deltaRPM + " in " + seconds + " seconds");
    }

    @Override
    public void move() {
        battery.usage(3);
    }
}
