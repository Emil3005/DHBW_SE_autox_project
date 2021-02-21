package autox.configuration;

public interface IObservable {
    void registerSensorScanner(IObserver observer);

    void removeObserver(IObserver observer);

    void notifyObservers();
}
