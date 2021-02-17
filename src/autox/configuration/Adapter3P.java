package autox.configuration;
import autox.elements.battery.Battery;

public class Adapter3P extends Battery implements ILoadingStation {

    public void load() {
        loadP3();
    }



}
