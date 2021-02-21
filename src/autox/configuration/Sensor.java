package autox.configuration;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Sensor implements IObservable{
    private Set<IObserver> observerSet;
    private boolean carDoorOrBatteryStatusOrSensorChange;
    private boolean fl;
    private boolean fr;
    private boolean bl;
    private boolean br;
    private float battery;
    private float sensor0;
    private float sensor1;
    private float sensor2;
    private float sensor3;
    private float sensor4;
    private float sensor5;
    private float sensor6;
    private float sensor7;




    public Sensor() {
        observerSet = new HashSet<>();
    }

    public void registerSensorScanner(IObserver observer) {
        observerSet.add(observer);
    }

    public void removeObserver(IObserver observer) {
        observerSet.remove(observer);
    }

    public void setStatusChanged() {
        notifyObservers();
    }

    public void notifyObservers() {
        Iterator<IObserver> observerIterator = observerSet.iterator();
        while (observerIterator.hasNext()) {
            IObserver observer = observerIterator.next();
            observer.update(this, null);
        }
    }

    public boolean getFl() {
        return fl;
    }

    public void setFl(boolean fl) {
        if (this.fl != fl) {
            carDoorOrBatteryStatusOrSensorChange = true;
            this.fl = fl;
        }

        setStatusChanged();
    }

    public boolean getFr() {
        return fr;
    }

    public void setFr(boolean fr) {
        if (this.fr != fr) {
            carDoorOrBatteryStatusOrSensorChange = true;
            this.fr = fr;
        }

        setStatusChanged();
    }

    public boolean getBr() {
        return br;
    }

    public void setBr(boolean br) {
        if (this.br != br) {
            carDoorOrBatteryStatusOrSensorChange = true;
            this.br = br;
        }

        setStatusChanged();
    }

    public boolean getBl() {
        return bl;
    }

    public void setBl(boolean bl) {
        if (this.bl != bl) {
            carDoorOrBatteryStatusOrSensorChange = true;
            this.bl = bl;
        }

        setStatusChanged();
    }

    public float getBattery() {
        return battery;
    }

    public void setBattery(float battery) {
        if (this.battery != battery) {
            carDoorOrBatteryStatusOrSensorChange = true;
            this.battery = battery;
        }

        setStatusChanged();
    }

    public float getSensor0() {
        return sensor0;
    }

    public void setSensor0(float sensor) {
        if (this.sensor0 != sensor) {
            carDoorOrBatteryStatusOrSensorChange = true;
            this.sensor0 = sensor;
        }

        setStatusChanged();
    }
    public float getSensor1() {
        return sensor1;
    }

    public void setSensor1(float sensor) {
        if (this.sensor1 != sensor) {
            carDoorOrBatteryStatusOrSensorChange = true;
            this.sensor1 = sensor;
        }

        setStatusChanged();
    }
    public float getSensor2() {
        return sensor2;
    }

    public void setSensor2(float sensor) {
        if (this.sensor2 != sensor) {
            carDoorOrBatteryStatusOrSensorChange = true;
            this.sensor2 = sensor;
        }

        setStatusChanged();
    }
    public float getSensor3() {
        return sensor3;
    }

    public void setSensor3(float sensor) {
        if (this.sensor3 != sensor) {
            carDoorOrBatteryStatusOrSensorChange = true;
            this.sensor3 = sensor;
        }

        setStatusChanged();
    }
    public float getSensor4() {
        return sensor4;
    }

    public void setSensor4(float sensor) {
        if (this.sensor4 != sensor) {
            carDoorOrBatteryStatusOrSensorChange = true;
            this.sensor4 = sensor;
        }

        setStatusChanged();
    }
    public float getSensor5() {
        return sensor5;
    }

    public void setSensor5(float sensor) {
        if (this.sensor5 != sensor) {
            carDoorOrBatteryStatusOrSensorChange = true;
            this.sensor5 = sensor;
        }

        setStatusChanged();
    }
    public float getSensor6() {
        return sensor6;
    }

    public void setSensor6(float sensor) {
        if (this.sensor6 != sensor) {
            carDoorOrBatteryStatusOrSensorChange = true;
            this.sensor6 = sensor;
        }

        setStatusChanged();
    }
    public float getSensor7() {
        return sensor7;
    }

    public void setSensor7(float sensor) {
        if (this.sensor7 != sensor) {
            carDoorOrBatteryStatusOrSensorChange = true;
            this.sensor7 = sensor;
        }

        setStatusChanged();
    }
}
