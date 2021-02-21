package autox.Tasks;

import autox.cars.CarType;
import autox.configuration.Sensor;

public class ObserverTask {
    public static void main(String... args) {
        start();
    }

    private static void start() {
        Sensor sensor = new Sensor();

        CarType car = new CarType("AutoX");
        sensor.registerSensorScanner(car);

        sensor.setSensor0(98.9F);
        sensor.setBl(true);
    }

    public ObserverTask(){
       start();
    }
}
