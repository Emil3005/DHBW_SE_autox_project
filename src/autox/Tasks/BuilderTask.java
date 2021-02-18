package autox.Tasks;
import autox.cars.AutoX;
public class BuilderTask {
    public static void main(String... args){
        AutoX autox = new AutoX.Builder().blinker(4)
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

        System.out.println("done");

    }
}
