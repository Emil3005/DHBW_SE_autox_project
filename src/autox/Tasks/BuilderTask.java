package autox.Tasks;
import autox.cars.AutoX;
public class BuilderTask {
    public BuilderTask(){
        System.out.println("Builder Operation started");
        System.out.println("Autobots roll out");
        autoX = new AutoX.Builder().blinker(4)
                .brake(8)
                .brakeLights(2)
                .camera(2)
                .chassis(1)
                .door(4)
                .electricMotor(1)
                .gps(2)
                .led_headLight(2)
                .lidar(4)
                .seat(6)
                .wheel(4)
                .build();

        System.out.println("Builder Operation done");
    }
    private static AutoX autoX;
    public static void main(String... args){
        System.out.println("Builder Operation started");
        System.out.println("Autobots roll out");
        autoX = new AutoX.Builder().blinker(4)
                .brake(8)
                .brakeLights(2)
                .camera(2)
                .chassis(1)
                .door(4)
                .electricMotor(1)
                .gps(2)
                .led_headLight(2)
                .lidar(4)
                .seat(6)
                .wheel(4)
                .build();

        System.out.println("Builder Operation done");

    }
    public static AutoX getAutoX(){
        return autoX;
    }
}
