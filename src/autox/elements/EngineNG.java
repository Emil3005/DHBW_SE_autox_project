package autox.elements;

public class EngineNG implements IElectricEngine {

    @Override
    public void EngineOn() {
        System.out.println("EngineNG on");
    }

    @Override
    public void EngineOff() {
        System.out.println("EngineNG off");
    }

    @Override
    public void IncreaseRPM(double deltaRPM, double seconds) {
        System.out.println("EngineNG increase RPM by "+ deltaRPM + " in " + seconds + " seconds");
    }

    @Override
    public void DecreaseRPM(double deltaRPM, double seconds) {
        System.out.println("EngineNG decrease RPM by "+ deltaRPM + " in " + seconds + " seconds");
    }

    @Override
    public void move() {
        battery.usage(3);

    }
}
