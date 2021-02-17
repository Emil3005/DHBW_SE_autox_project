package autox.cars;
import autox.elements.*;

public class AutoX {
    Chassis[] chassis;
    ElectricEngine[] electricEngine;
    LED_Headlight[] led_headLights;
    BrakeLight[] brakeLights;
    Blinker[] blinkers;
    Door[] doors;
    Seat[] seats;
    Wheel[] wheels;
    Brake[] brakes;
    GPS[] gps;
    ICamera[] ICameras;
    ILidar[] ILidars;

    public AutoX(Builder builder) {
        chassis = builder.chassis;
        electricEngine = builder.electricEngine;
        led_headLights = builder.led_headLight;
        brakeLights = builder.brakeLights;
        blinkers = builder.blinkers;
        doors = builder.doors;
        seats = builder.seats;
        wheels = builder.wheels;
        brakes = builder.brakes;
        gps = builder.gps;
        ICameras = builder.ICameras;
        ILidars = builder.ILidars;
    }

public static class Builder {
    Chassis[] chassis;
    ElectricEngine[] electricEngine;
    LED_Headlight[] led_headLight;
    BrakeLight[] brakeLights;
    Blinker[] blinkers;
    Door[] doors;
    Seat[] seats;
    Wheel[] wheels;
    Brake[] brakes;
    GPS[] gps;
    ICamera[] ICameras;
    ILidar[] ILidars;

    public Builder chassis(int amount) {
        chassis = new Chassis[amount];
        return this;
    }

    public Builder electricMotor(int amount) {
        electricEngine = new ElectricEngine[amount];
        return this;
    }

    public Builder led_headLight(int amount) {
        led_headLight = new LED_Headlight[amount];
        return this;
    }

    public Builder brakeLights(int amount) {
        brakeLights = new BrakeLight[amount];
        return this;
    }

    public Builder blinker(int amount) {
        blinkers = new Blinker[amount];
        return this;
    }

    public Builder door(int amount) {
        doors = new Door[amount];
        return this;
    }

    public Builder seat(int amount) {
        seats = new Seat[amount];
        return this;
    }

    public Builder wheel(int amount) {
        wheels = new Wheel[amount];
        return this;
    }

    public Builder brake(int amount) {
        brakes = new Brake[amount];
        return this;
    }

    public Builder gps(int amount) {
        gps = new GPS[amount];
        return this;
    }

    public Builder camera(int amount) {
        ICameras = new ICamera[amount];
        return this;
    }

    public Builder lidar(int amount) {
        ILidars = new ILidar[amount];
        return this;
    }


    public AutoX build() {
        return new AutoX(this);
    }

}
}

