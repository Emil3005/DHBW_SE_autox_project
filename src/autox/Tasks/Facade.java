package autox.Tasks;
import autox.cars.AutoX;
import autox.elements.*;
public class Facade {
    AutoX autox;
    IElectricEngine engine;
    LED_Headlight led_headlight;
    GPS gps;
    ICamera camera;
    Brake brake;
    Indicator indicator;
    ILidar lidar;
    BrakeLight brakeLight;

    public void startup(){
        engine.EngineOn();
        led_headlight.LED_On();
        gps.GPS_On();
        gps.GPSCOnnectSatellite("118.75");
        camera.CameraOn();
        lidar.LidarOn();
        indicator.LeftIndicatorOff();
    }
    public void move(double deltaRPM, double seconds){
        indicator.LeftIndicatorOff();
        indicator.RightIndicatorOff();
        led_headlight.LED_Dimmed();
        engine.IncreaseRPM(deltaRPM,seconds);
        brake.BrakeSet(0);
        brakeLight.BrakeLightOff();
    }
    public void leftTurn(double deltaRPM,double seconds){
        indicator.LeftIndicatorOn();
        engine.DecreaseRPM(deltaRPM,seconds);
        brake.BrakeSet(70);
        brakeLight.BrakeLightOn();
    }
    public void rightTurn(double deltaRPM,double seconds){
        indicator.RightIndicatorOff();
        engine.DecreaseRPM(deltaRPM,seconds);
        brake.BrakeSet(70);
        brakeLight.BrakeLightOn();
    }
    public void stop(){
        brake.BrakeSet(100);
        brakeLight.BrakeLightOn();
    }
    public void emergencyStop(){
        brake.BrakeSet(100);
        brakeLight.BrakeLightOn();
        indicator.HazardWarningOn();
        engine.EngineOff();
        led_headlight.LED_HighBeam();
        camera.CameraOff();
        lidar.LidarOff();
    }
    public void shutdown(){
        brake.BrakeSet(100);
        engine.EngineOff();
        brakeLight.BrakeLightOff();
        led_headlight.LED_Off();
        indicator.HaardWarningOff();
        gps.GPS_Off();
        camera.CameraOff();
        lidar.LidarOff();
    }
}
