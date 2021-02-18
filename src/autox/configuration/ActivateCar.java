package autox.configuration;

import autox.cars.AutoX;
import autox.cars.Car;

public class ActivateCar implements IReceiveModule {
    private Car autoX;

    public ActivateCar(Car autoX){
        this.autoX = autoX;
    }


    @Override
    public void execute() {
        autoX.activate();
    }
}
