package autox.configuration;

import autox.cars.CarType;

public interface IObserver {
    void update(IObservable observable, CarType carType);
}
