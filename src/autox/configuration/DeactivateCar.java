package autox.configuration;

import autox.cars.AutoX;
import autox.cars.Car;

public class DeactivateCar implements IReceiveModule {
    private Car autoX;

    public DeactivateCar(Car autoX){
        this.autoX = autoX;
    }


    @Override
    public void execute() {
        autoX.deactivate();

    }
}
