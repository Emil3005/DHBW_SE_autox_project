package autox.cars;

import autox.configuration.IObservable;
import autox.configuration.IObserver;
import autox.configuration.Sensor;

public class CarType implements IObserver {
        private String name;

        public CarType(String name) {
            this.name = name;
        }

        public void update(IObservable observable, CarType carType) {
            Sensor sensor = (Sensor) observable;
            String message = ("\nDoors: \n" +
                    "Front Left:"+sensor.getFl()+
                    "| Front Right:" + sensor.getFr()+
                    "| Back Left:"+sensor.getBl()+
                    "| Back Right:" + sensor.getBr()+
                    "\nSensors:\n" +
                    "Sensor0:" +sensor.getSensor0()+
                    "| Sensor1:" +sensor.getSensor1()+
                    "| Sensor2:" +sensor.getSensor2()+
                    "| Sensor3:" +sensor.getSensor3()+
                    "| Sensor4:" +sensor.getSensor4()+
                    "| Sensor5:" +sensor.getSensor5()+
                    "| Sensor6:" +sensor.getSensor6()+
                    "| Sensor7:" +sensor.getSensor7()+
                    "\nBattery:\n" +
                    "Temperature:" + sensor.getBattery());

            notify(message);
        }

        public void notify(String message) {
            System.out.println("\n"+name + message+"\n");
        }
    }



