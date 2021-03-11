package autox.Tasks;
import autox.cars.AutoX;
import autox.elements.*;
public class Facade {
    public Facade(){
        start();

    }

    private void start() {
        System.out.println("Facade Operation started");

        this.startup();
        this.move(40,20);
        this.leftTurn(40,20);
        this.rightTurn(40,20);
        emergencyStop();
        shutdown();
        stop();
        System.out.println("Facade Operation done");
    }

    public static void main(String... args) {
        System.out.println("Facade Operation started");
        Facade facade = new Facade();
            facade.startup();
            facade.move(40,20);
            facade.leftTurn(40,20);
            facade.rightTurn(40,20);
            facade.emergencyStop();
            facade.shutdown();
            facade.stop();
        System.out.println("Facade Operation done");
    }
    EngineX engine              = new EngineX();
    LED_Headlight led_headlight = new LED_Headlight();
    GPS gps                     = new GPS();
    ICamera camera              = new CameraV1();
    Brake brake                 = new Brake();
    Indicator indicator         = new Indicator();
    ILidar lidar                = new LidarNG();
    BrakeLight brakeLight       = new BrakeLight();

    public void startup(){
        engine.EngineOn();
        led_headlight.LED_On();
        gps.GPS_On();
        gps.GPSConnectSatellite("118.75");
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
        indicator.HazardWarningOff();
        gps.GPS_Off();
        camera.CameraOff();
        lidar.LidarOff();
    }

}
